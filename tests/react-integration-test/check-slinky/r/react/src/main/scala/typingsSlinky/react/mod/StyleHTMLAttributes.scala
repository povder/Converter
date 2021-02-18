package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var media: scala.Unit | String = js.native
  
  var nonce: scala.Unit | String = js.native
  
  var scoped: scala.Unit | Boolean = js.native
  
  var `type`: scala.Unit | String = js.native
}
object StyleHTMLAttributes {
  
  @scala.inline
  def apply[T](): StyleHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class StyleHTMLAttributesMutableBuilder[Self <: StyleHTMLAttributes[?], T] (val x: Self & StyleHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", ())
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", ())
    
    @scala.inline
    def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedUndefined: Self = StObject.set(x, "scoped", ())
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", ())
  }
}
