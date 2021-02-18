package org.scalablytyped.converter.internal
package scalajs
package flavours

import org.scalablytyped.converter.Selection
import org.scalablytyped.converter.internal.scalajs.transforms.{Adapter, CleanIllegalNames}

case class JapgollyFlavour(
    outputPkg:              Name,
    enableLongApplyMethod:  Boolean,
    versions:               Versions,
    enableReactTreeShaking: Selection[Name],
) extends FlavourImplReact {
  override val dependencies  = Set(versions.runtime, versions.scalajsReact)
  val rewriter               = new CastConversion.TypeRewriterCast(JapgollyTypeConversions(reactNames, scalaJsDomNames))
  val memberToPro            = new JapgollyMemberToProp(reactNames, rewriter)
  val findProps              = new FindProps(new CleanIllegalNames(outputPkg), memberToPro, parentsResolver)
  val genStBuildingComponent = new JapgollyGenStBuildingComponent(outputPkg, versions.scala)
  val genComponents          = new JapgollyGenComponents(findProps, genStBuildingComponent, reactNames)
  val genCompanions          = new GenCompanions(findProps, enableLongApplyMethod)

  final override def rewrittenTree(scope: TreeScope, tree: PackageTree): PackageTree = {
    val withCompanions = genCompanions.visitPackageTree(scope)(tree)

    val withComponents: PackageTree =
      if (involvesReact(scope)) {
        val components: IArray[Component] =
          identifyComponents.oneOfEach(scope / withCompanions, withCompanions) ++
            identifyComponents.intrinsics(scope / withCompanions)

        val ret = Adapter(scope)((t, s) => genComponents(s, t, components, enableLongApplyMethod))(withCompanions)

        if (isReact(scope))
          ret.copy(members = ret.members ++ IArray(genStBuildingComponent.Trait, genStBuildingComponent.Object.tree))
        else ret

      } else withCompanions

    rewriter.visitPackageTree(scope)(withComponents)
  }

  override val rewritesOpt: Option[CastConversion.TypeRewriterCast] = Some(rewriter)
}
