package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings._empty
import typingsSlinky.react.reactStrings.`use-credentials`
import typingsSlinky.react.reactStrings.anonymous
import typingsSlinky.react.reactStrings.async
import typingsSlinky.react.reactStrings.auto
import typingsSlinky.react.reactStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var alt: scala.Unit | String = js.native
  
  var crossOrigin: scala.Unit | anonymous | `use-credentials` | _empty = js.native
  
  var decoding: scala.Unit | async | auto | sync = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var sizes: scala.Unit | String = js.native
  
  var src: scala.Unit | String = js.native
  
  var srcSet: scala.Unit | String = js.native
  
  var useMap: scala.Unit | String = js.native
  
  var width: scala.Unit | Double | String = js.native
}
object ImgHTMLAttributes {
  
  @scala.inline
  def apply[T](): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ImgHTMLAttributesMutableBuilder[Self <: ImgHTMLAttributes[?], T] (val x: Self & ImgHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", ())
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", ())
    
    @scala.inline
    def setDecoding(value: async | auto | sync): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodingUndefined: Self = StObject.set(x, "decoding", ())
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", ())
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", ())
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSetUndefined: Self = StObject.set(x, "srcSet", ())
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", ())
    
    @scala.inline
    def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMapUndefined: Self = StObject.set(x, "useMap", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", ())
  }
}
