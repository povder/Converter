package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var default: scala.Unit | Boolean = js.native
  
  var kind: scala.Unit | String = js.native
  
  var label: scala.Unit | String = js.native
  
  var src: scala.Unit | String = js.native
  
  var srcLang: scala.Unit | String = js.native
}
object TrackHTMLAttributes {
  
  @scala.inline
  def apply[T](): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TrackHTMLAttributesMutableBuilder[Self <: TrackHTMLAttributes[?], T] (val x: Self & TrackHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", ())
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", ())
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", ())
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcLangUndefined: Self = StObject.set(x, "srcLang", ())
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", ())
  }
}
