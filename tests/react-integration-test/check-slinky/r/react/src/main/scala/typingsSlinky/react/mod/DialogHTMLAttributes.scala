package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var open: scala.Unit | Boolean = js.native
}
object DialogHTMLAttributes {
  
  @scala.inline
  def apply[T](): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DialogHTMLAttributesMutableBuilder[Self <: DialogHTMLAttributes[?], T] (val x: Self & DialogHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", ())
  }
}
