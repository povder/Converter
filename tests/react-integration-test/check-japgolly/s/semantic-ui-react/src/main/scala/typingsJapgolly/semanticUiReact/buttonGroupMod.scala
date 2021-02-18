package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.buttonMod.ButtonProps
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.genericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.genericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[ButtonGroupProps] = js.native
  
  @js.native
  trait ButtonGroupProps
    extends StrictButtonGroupProps
       with /* key */ StringDictionary[js.Any]
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
  }
  
  @js.native
  trait StrictButtonGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Groups can be attached to other content. */
    var attached: scala.Unit | Boolean | left | right | top | bottom = js.native
    
    /** Groups can be less pronounced. */
    var basic: scala.Unit | Boolean = js.native
    
    /** Array of shorthand Button values. */
    var buttons: scala.Unit | SemanticShorthandCollection[ButtonProps] = js.native
    
    /** Primary content. */
    var children: scala.Unit | Node = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Groups can have a shared color. */
    var color: scala.Unit | SemanticCOLORS = js.native
    
    /** Groups can reduce their padding to fit into tighter spaces. */
    var compact: scala.Unit | Boolean = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
    
    /** Groups can be aligned to the left or right of its container. */
    var floated: scala.Unit | SemanticFLOATS = js.native
    
    /** Groups can take the width of their container. */
    var fluid: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted as icons. */
    var icon: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to appear on dark backgrounds. */
    var inverted: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted as labeled icon buttons. */
    var labeled: scala.Unit | Boolean = js.native
    
    /** Groups can hint towards a negative consequence. */
    var negative: scala.Unit | Boolean = js.native
    
    /** Groups can hint towards a positive consequence. */
    var positive: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to show different levels of emphasis. */
    var primary: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to show different levels of emphasis. */
    var secondary: scala.Unit | Boolean = js.native
    
    /** Groups can have different sizes. */
    var size: scala.Unit | SemanticSIZES = js.native
    
    /** Groups can be formatted to toggle on and off. */
    var toggle: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to appear vertically. */
    var vertical: scala.Unit | Boolean = js.native
    
    /** Groups can have their widths divided evenly. */
    var widths: scala.Unit | SemanticWIDTHS = js.native
  }
  object StrictButtonGroupProps {
    
    @scala.inline
    def apply(): StrictButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonGroupProps]
    }
    
    @scala.inline
    implicit class StrictButtonGroupPropsMutableBuilder[Self <: StrictButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", ())
      
      @scala.inline
      def setAttached(value: Boolean | left | right | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", ())
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", ())
      
      @scala.inline
      def setButtons(value: SemanticShorthandCollection[ButtonProps]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", ())
      
      @scala.inline
      def setButtonsVarargs(value: SemanticShorthandItem[ButtonProps]*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
      
      @scala.inline
      def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", ())
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", ())
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", ())
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", ())
      
      @scala.inline
      def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", ())
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", ())
      
      @scala.inline
      def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", ())
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", ())
      
      @scala.inline
      def setLabeled(value: Boolean): Self = StObject.set(x, "labeled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabeledUndefined: Self = StObject.set(x, "labeled", ())
      
      @scala.inline
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", ())
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", ())
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", ())
      
      @scala.inline
      def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", ())
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", ())
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", ())
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", ())
      
      @scala.inline
      def setWidths(value: SemanticWIDTHS): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", ())
    }
  }
  
  type _To = StatelessComponent[ButtonGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupMod.foo` */
  override def _to: StatelessComponent[ButtonGroupProps] = default
}
