package typingsJapgolly.react.mod

import typingsJapgolly.react.reactStrings.baseline
import typingsJapgolly.react.reactStrings.bottom
import typingsJapgolly.react.reactStrings.center
import typingsJapgolly.react.reactStrings.char
import typingsJapgolly.react.reactStrings.justify
import typingsJapgolly.react.reactStrings.left
import typingsJapgolly.react.reactStrings.middle
import typingsJapgolly.react.reactStrings.right
import typingsJapgolly.react.reactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TdHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var align: scala.Unit | left | center | right | justify | char = js.native
  
  var colSpan: scala.Unit | Double = js.native
  
  var headers: scala.Unit | String = js.native
  
  var rowSpan: scala.Unit | Double = js.native
  
  var scope: scala.Unit | String = js.native
  
  var valign: scala.Unit | top | middle | bottom | baseline = js.native
}
object TdHTMLAttributes {
  
  @scala.inline
  def apply[T](): TdHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TdHTMLAttributesMutableBuilder[Self <: TdHTMLAttributes[?], T] (val x: Self & TdHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", ())
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", ())
    
    @scala.inline
    def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", ())
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", ())
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", ())
    
    @scala.inline
    def setValign(value: top | middle | bottom | baseline): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValignUndefined: Self = StObject.set(x, "valign", ())
  }
}
