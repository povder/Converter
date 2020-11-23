package typings.vue

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import typings.vue.anon.Render
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeMod {
  
  type ScopedSlot = js.Function1[/* props */ js.Any, VNodeChildrenArrayContents | String]
  
  @js.native
  trait VNode extends StObject {
    
    var children: scala.Unit | js.Array[VNode] = js.native
    
    var componentInstance: scala.Unit | Vue = js.native
    
    var componentOptions: scala.Unit | VNodeComponentOptions = js.native
    
    var context: scala.Unit | Vue = js.native
    
    var data: scala.Unit | VNodeData = js.native
    
    var elm: scala.Unit | Node = js.native
    
    var isComment: Boolean = js.native
    
    var isRootInsert: Boolean = js.native
    
    var isStatic: scala.Unit | Boolean = js.native
    
    var key: scala.Unit | String | Double = js.native
    
    var ns: scala.Unit | String = js.native
    
    var parent: scala.Unit | VNode = js.native
    
    var raw: scala.Unit | Boolean = js.native
    
    var tag: scala.Unit | String = js.native
    
    var text: scala.Unit | String = js.native
  }
  object VNode {
    
    @scala.inline
    def apply(isComment: Boolean, isRootInsert: Boolean): VNode = {
      val __obj = js.Dynamic.literal(isComment = isComment.asInstanceOf[js.Any], isRootInsert = isRootInsert.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode]
    }
    
    @scala.inline
    implicit class VNodeMutableBuilder[Self <: VNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
      
      @scala.inline
      def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setComponentInstance(value: Vue): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentInstanceUndefined: Self = StObject.set(x, "componentInstance", ())
      
      @scala.inline
      def setComponentOptions(value: VNodeComponentOptions): Self = StObject.set(x, "componentOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentOptionsUndefined: Self = StObject.set(x, "componentOptions", ())
      
      @scala.inline
      def setContext(value: Vue): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", ())
      
      @scala.inline
      def setData(value: VNodeData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", ())
      
      @scala.inline
      def setElm(value: Node): Self = StObject.set(x, "elm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElmUndefined: Self = StObject.set(x, "elm", ())
      
      @scala.inline
      def setIsComment(value: Boolean): Self = StObject.set(x, "isComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRootInsert(value: Boolean): Self = StObject.set(x, "isRootInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStaticUndefined: Self = StObject.set(x, "isStatic", ())
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", ())
      
      @scala.inline
      def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsUndefined: Self = StObject.set(x, "ns", ())
      
      @scala.inline
      def setParent(value: VNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", ())
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", ())
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", ())
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", ())
    }
  }
  
  type VNodeChildren = VNodeChildrenArrayContents | js.Array[ScopedSlot] | String
  
  @js.native
  trait VNodeChildrenArrayContents extends /* x */ NumberDictionary[VNode | String | VNodeChildren]
  object VNodeChildrenArrayContents {
    
    @scala.inline
    def apply(): VNodeChildrenArrayContents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeChildrenArrayContents]
    }
  }
  
  @js.native
  trait VNodeComponentOptions extends StObject {
    
    var Ctor: VueConstructor[Vue] = js.native
    
    var children: scala.Unit | VNodeChildren = js.native
    
    var listeners: scala.Unit | js.Object = js.native
    
    var propsData: scala.Unit | js.Object = js.native
    
    var tag: scala.Unit | String = js.native
  }
  object VNodeComponentOptions {
    
    @scala.inline
    def apply(Ctor: VueConstructor[Vue]): VNodeComponentOptions = {
      val __obj = js.Dynamic.literal(Ctor = Ctor.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeComponentOptions]
    }
    
    @scala.inline
    implicit class VNodeComponentOptionsMutableBuilder[Self <: VNodeComponentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: VNodeChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
      
      @scala.inline
      def setChildrenVarargs(value: ScopedSlot*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCtor(value: VueConstructor[Vue]): Self = StObject.set(x, "Ctor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListeners(value: js.Object): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", ())
      
      @scala.inline
      def setPropsData(value: js.Object): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsDataUndefined: Self = StObject.set(x, "propsData", ())
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", ())
    }
  }
  
  @js.native
  trait VNodeData extends StObject {
    
    var attrs: scala.Unit | StringDictionary[js.Any] = js.native
    
    var `class`: scala.Unit | js.Any = js.native
    
    var directives: scala.Unit | js.Array[VNodeDirective] = js.native
    
    var domProps: scala.Unit | StringDictionary[js.Any] = js.native
    
    var hook: scala.Unit | StringDictionary[js.Function] = js.native
    
    var inlineTemplate: scala.Unit | Render = js.native
    
    var keepAlive: scala.Unit | Boolean = js.native
    
    var key: scala.Unit | String | Double = js.native
    
    var nativeOn: scala.Unit | (StringDictionary[js.Function | js.Array[js.Function]]) = js.native
    
    var on: scala.Unit | (StringDictionary[js.Function | js.Array[js.Function]]) = js.native
    
    var props: scala.Unit | StringDictionary[js.Any] = js.native
    
    var ref: scala.Unit | String = js.native
    
    var scopedSlots: scala.Unit | StringDictionary[ScopedSlot] = js.native
    
    var show: scala.Unit | Boolean = js.native
    
    var slot: scala.Unit | String = js.native
    
    var staticClass: scala.Unit | String = js.native
    
    var staticStyle: scala.Unit | StringDictionary[js.Any] = js.native
    
    var style: scala.Unit | js.Array[js.Object] | js.Object = js.native
    
    var tag: scala.Unit | String = js.native
    
    var transition: scala.Unit | js.Object = js.native
  }
  object VNodeData {
    
    @scala.inline
    def apply(): VNodeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeData]
    }
    
    @scala.inline
    implicit class VNodeDataMutableBuilder[Self <: VNodeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", ())
      
      @scala.inline
      def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", ())
      
      @scala.inline
      def setDirectives(value: js.Array[VNodeDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", ())
      
      @scala.inline
      def setDirectivesVarargs(value: VNodeDirective*): Self = StObject.set(x, "directives", js.Array(value :_*))
      
      @scala.inline
      def setDomProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "domProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomPropsUndefined: Self = StObject.set(x, "domProps", ())
      
      @scala.inline
      def setHook(value: StringDictionary[js.Function]): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookUndefined: Self = StObject.set(x, "hook", ())
      
      @scala.inline
      def setInlineTemplate(value: Render): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", ())
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", ())
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", ())
      
      @scala.inline
      def setNativeOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = StObject.set(x, "nativeOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeOnUndefined: Self = StObject.set(x, "nativeOn", ())
      
      @scala.inline
      def setOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", ())
      
      @scala.inline
      def setProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", ())
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", ())
      
      @scala.inline
      def setScopedSlots(value: StringDictionary[ScopedSlot]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", ())
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", ())
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", ())
      
      @scala.inline
      def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticClassUndefined: Self = StObject.set(x, "staticClass", ())
      
      @scala.inline
      def setStaticStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "staticStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticStyleUndefined: Self = StObject.set(x, "staticStyle", ())
      
      @scala.inline
      def setStyle(value: js.Array[js.Object] | js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", ())
      
      @scala.inline
      def setStyleVarargs(value: js.Object*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", ())
      
      @scala.inline
      def setTransition(value: js.Object): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", ())
    }
  }
  
  @js.native
  trait VNodeDirective extends StObject {
    
    val arg: String = js.native
    
    val expression: js.Any = js.native
    
    val modifiers: StringDictionary[Boolean] = js.native
    
    val name: String = js.native
    
    val oldValue: js.Any = js.native
    
    val value: js.Any = js.native
  }
  object VNodeDirective {
    
    @scala.inline
    def apply(
      arg: String,
      expression: js.Any,
      modifiers: StringDictionary[Boolean],
      name: String,
      oldValue: js.Any,
      value: js.Any
    ): VNodeDirective = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeDirective]
    }
    
    @scala.inline
    implicit class VNodeDirectiveMutableBuilder[Self <: VNodeDirective] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiers(value: StringDictionary[Boolean]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
