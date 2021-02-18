package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var dateTime: scala.Unit | String = js.native
}
object TimeHTMLAttributes {
  
  @scala.inline
  def apply[T](): TimeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TimeHTMLAttributesMutableBuilder[Self <: TimeHTMLAttributes[?], T] (val x: Self & TimeHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", ())
  }
}
