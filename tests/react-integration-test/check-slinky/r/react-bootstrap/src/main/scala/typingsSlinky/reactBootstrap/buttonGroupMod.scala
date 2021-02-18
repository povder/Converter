package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("react-bootstrap/lib/ButtonGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ButtonGroupProps, js.Object, js.Any]
  
  @js.native
  trait ButtonGroup
    extends Component[ButtonGroupProps, js.Object, js.Any]
  
  @js.native
  trait ButtonGroupProps extends HTMLProps[ButtonGroup] {
    
    var block: scala.Unit | Boolean = js.native
    
    var bsSize: scala.Unit | Sizes = js.native
    
    var bsStyle: scala.Unit | String = js.native
    
    var justified: scala.Unit | Boolean = js.native
    
    var vertical: scala.Unit | Boolean = js.native
  }
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    @scala.inline
    implicit class ButtonGroupPropsMutableBuilder[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", ())
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", ())
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", ())
      
      @scala.inline
      def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifiedUndefined: Self = StObject.set(x, "justified", ())
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", ())
    }
  }
}
