package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var form: scala.Unit | String = js.native
  
  var htmlFor: scala.Unit | String = js.native
  
  var name: scala.Unit | String = js.native
}
object OutputHTMLAttributes {
  
  @scala.inline
  def apply[T](): OutputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class OutputHTMLAttributesMutableBuilder[Self <: OutputHTMLAttributes[?], T] (val x: Self & OutputHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", ())
    
    @scala.inline
    def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", ())
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", ())
  }
}
