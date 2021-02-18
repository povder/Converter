package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var cite: scala.Unit | String = js.native
  
  var dateTime: scala.Unit | String = js.native
}
object DelHTMLAttributes {
  
  @scala.inline
  def apply[T](): DelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DelHTMLAttributesMutableBuilder[Self <: DelHTMLAttributes[?], T] (val x: Self & DelHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiteUndefined: Self = StObject.set(x, "cite", ())
    
    @scala.inline
    def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", ())
  }
}
