package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var href: scala.Unit | String = js.native
  
  var target: scala.Unit | String = js.native
}
object BaseHTMLAttributes {
  
  @scala.inline
  def apply[T](): BaseHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class BaseHTMLAttributesMutableBuilder[Self <: BaseHTMLAttributes[?], T] (val x: Self & BaseHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", ())
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", ())
  }
}
