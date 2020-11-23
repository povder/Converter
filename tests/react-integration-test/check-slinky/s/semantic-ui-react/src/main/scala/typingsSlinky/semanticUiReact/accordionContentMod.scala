package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionContent", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AccordionContentProps] = js.native
  
  @js.native
  trait AccordionContentProps
    extends StrictAccordionContentProps
       with /* key */ StringDictionary[js.Any]
  object AccordionContentProps {
    
    @scala.inline
    def apply(): AccordionContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionContentProps]
    }
  }
  
  @js.native
  trait StrictAccordionContentProps extends StObject {
    
    /** Whether or not the content is visible. */
    var active: scala.Unit | Boolean = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Primary content. */
    var children: scala.Unit | ReactElement = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
  }
  object StrictAccordionContentProps {
    
    @scala.inline
    def apply(): StrictAccordionContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionContentProps]
    }
    
    @scala.inline
    implicit class StrictAccordionContentPropsMutableBuilder[Self <: StrictAccordionContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", ())
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", ())
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", ())
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", ())
    }
  }
  
  type _To = ReactComponentClass[AccordionContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `accordionContentMod.foo` */
  override def _to: ReactComponentClass[AccordionContentProps] = default
}
