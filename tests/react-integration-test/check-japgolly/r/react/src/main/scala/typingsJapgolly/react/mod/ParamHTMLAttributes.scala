package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var name: scala.Unit | String = js.native
  
  var value: scala.Unit | String | js.Array[String] | Double = js.native
}
object ParamHTMLAttributes {
  
  @scala.inline
  def apply[T](): ParamHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ParamHTMLAttributesMutableBuilder[Self <: ParamHTMLAttributes[?], T] (val x: Self & ParamHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", ())
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
