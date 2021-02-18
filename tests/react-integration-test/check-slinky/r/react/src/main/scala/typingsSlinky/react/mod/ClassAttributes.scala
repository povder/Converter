package typingsSlinky.react.mod

import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassAttributes[T] extends Attributes {
  
  var ref: scala.Unit | LegacyRef[T] = js.native
}
object ClassAttributes {
  
  @scala.inline
  def apply[T](): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAttributes[T]]
  }
  
  @scala.inline
  implicit class ClassAttributesMutableBuilder[Self <: ClassAttributes[?], T] (val x: Self & ClassAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", ())
  }
}
