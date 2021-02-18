package typingsJapgolly.react.mod

import typingsJapgolly.react.reactStrings.button
import typingsJapgolly.react.reactStrings.reset
import typingsJapgolly.react.reactStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var formAction: js.UndefOr[String] = js.native
  
  var formEncType: js.UndefOr[String] = js.native
  
  var formMethod: js.UndefOr[String] = js.native
  
  var formNoValidate: js.UndefOr[Boolean] = js.native
  
  var formTarget: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[submit | reset | button] = js.native
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
}
object ButtonHTMLAttributes {
  
  @scala.inline
  def apply[T](): ButtonHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ButtonHTMLAttributesMutableBuilder[Self <: ButtonHTMLAttributes[?], T] (val x: Self & ButtonHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", ())
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", ())
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormActionUndefined: Self = StObject.set(x, "formAction", ())
    
    @scala.inline
    def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", ())
    
    @scala.inline
    def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormMethodUndefined: Self = StObject.set(x, "formMethod", ())
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", ())
    
    @scala.inline
    def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormTargetUndefined: Self = StObject.set(x, "formTarget", ())
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", ())
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", ())
    
    @scala.inline
    def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", ())
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
