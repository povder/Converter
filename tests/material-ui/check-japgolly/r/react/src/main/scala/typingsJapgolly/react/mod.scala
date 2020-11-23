package typingsJapgolly.react

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.react.anon.Children
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.reactStrings.foo
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AllHTMLAttributes[T] extends HTMLAttributes[T] {
    
    var accept: scala.Unit | String = js.native
    
    var acceptCharset: scala.Unit | String = js.native
  }
  object AllHTMLAttributes {
    
    @scala.inline
    def apply[T](): AllHTMLAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllHTMLAttributes[T]]
    }
    
    @scala.inline
    implicit class AllHTMLAttributesMutableBuilder[Self <: AllHTMLAttributes[?], T] (val x: Self & AllHTMLAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", ())
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", ())
    }
  }
  
  @js.native
  trait Component[P, S] extends StObject
  
  @js.native
  trait ComponentClass[P]
    extends Instantiable1[
          /* props */ P, 
          japgolly.scalajs.react.raw.React.Component[P & js.Object, js.Object]
        ]
       with Instantiable2[
          /* props */ P, 
          /* context */ js.Any, 
          japgolly.scalajs.react.raw.React.Component[P & js.Object, js.Object]
        ] {
    
    var defaultProps: scala.Unit | Partial[P] = js.native
    
    var displayName: scala.Unit | String = js.native
  }
  
  type ComponentState = js.Object
  
  type ComponentType[P] = (ComponentClassP[P & js.Object]) | StatelessComponent[P]
  
  @js.native
  trait DOMAttributes[T] extends StObject {
    
    var children: scala.Unit | Node = js.native
    
    var dangerouslySetInnerHTML: scala.Unit | Html = js.native
    
    var onClick: scala.Unit | Double | (js.Function1[/* x */ String, Unit]) = js.native
  }
  object DOMAttributes {
    
    @scala.inline
    def apply[T](): DOMAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMAttributes[T]]
    }
    
    @scala.inline
    implicit class DOMAttributesMutableBuilder[Self <: DOMAttributes[?], T] (val x: Self & DOMAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", ())
      
      @scala.inline
      def setOnClick(value: Double | (js.Function1[/* x */ String, Unit])): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickFunction1(value: /* x */ String => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* x */ String) => value(t0).runNow()))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", ())
    }
  }
  
  @js.native
  trait HTMLAttributes[T] extends DOMAttributes[T] {
    
    var defaultChecked: scala.Unit | Boolean = js.native
  }
  object HTMLAttributes {
    
    @scala.inline
    def apply[T](): HTMLAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLAttributes[T]]
    }
    
    @scala.inline
    implicit class HTMLAttributesMutableBuilder[Self <: HTMLAttributes[?], T] (val x: Self & HTMLAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", ())
    }
  }
  
  @js.native
  trait HTMLProps[T] extends AllHTMLAttributes[T] {
    
    var defaultValue: foo = js.native
    
    var onChange: foo = js.native
    
    var `type`: foo = js.native
    
    var value: foo = js.native
  }
  object HTMLProps {
    
    @scala.inline
    def apply[T](defaultValue: foo, onChange: foo, `type`: foo, value: foo): HTMLProps[T] = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLProps[T]]
    }
    
    @scala.inline
    implicit class HTMLPropsMutableBuilder[Self <: HTMLProps[?], T] (val x: Self & HTMLProps[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: foo): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: foo): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: foo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: foo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Key = String | Double
  
  @js.native
  trait ReactElement extends StObject {
    
    var key: Key | Null = js.native
    
    var props: js.Any = js.native
    
    var `type`: String | ComponentClassP[js.Object] | SFC[?] = js.native
  }
  object ReactElement {
    
    @scala.inline
    def apply(props: js.Any, `type`: String | ComponentClassP[js.Object] | SFC[?]): Element = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ReactElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String | ComponentClassP[js.Object] | SFC[?]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeComponentClass(value: ComponentClassP[js.Object]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactNode = scala.Unit | String | Double | Boolean
  
  type SFC[P] = StatelessComponent[P]
  
  type SVGAttributes[T] = DOMAttributes[T]
  
  @js.native
  trait StatelessComponent[P] extends StObject {
    
    def apply(props: P & Children): Element | Null = js.native
    def apply(props: P & Children, context: js.Any): Element | Null = js.native
    
    var defaultProps: scala.Unit | Partial[P] = js.native
    
    var displayName: scala.Unit | String = js.native
  }
}
