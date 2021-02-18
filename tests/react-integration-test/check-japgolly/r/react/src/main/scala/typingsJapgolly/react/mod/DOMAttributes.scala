package typingsJapgolly.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMAttributes[T] extends StObject {
  
  var children: scala.Unit | Node = js.native
  
  var dangerouslySetInnerHTML: scala.Unit | Html = js.native
  
  // Media Events
  var onAbort: scala.Unit | ReactEventHandler[T] = js.native
  
  var onAnimationEnd: scala.Unit | AnimationEventHandler[T] = js.native
  
  var onAnimationIteration: scala.Unit | AnimationEventHandler[T] = js.native
  
  // Animation Events
  var onAnimationStart: scala.Unit | AnimationEventHandler[T] = js.native
  
  // MouseEvents
  var onAuxClick: scala.Unit | MouseEventHandler[T] = js.native
  
  var onBeforeInput: scala.Unit | FormEventHandler[T] = js.native
  
  var onBlur: scala.Unit | FocusEventHandler[T] = js.native
  
  var onCanPlay: scala.Unit | ReactEventHandler[T] = js.native
  
  var onCanPlayThrough: scala.Unit | ReactEventHandler[T] = js.native
  
  // Form Events
  var onChange: scala.Unit | FormEventHandler[T] = js.native
  
  var onClick: scala.Unit | MouseEventHandler[T] = js.native
  
  // Composition Events
  var onCompositionEnd: scala.Unit | CompositionEventHandler[T] = js.native
  
  var onCompositionStart: scala.Unit | CompositionEventHandler[T] = js.native
  
  var onCompositionUpdate: scala.Unit | CompositionEventHandler[T] = js.native
  
  var onContextMenu: scala.Unit | MouseEventHandler[T] = js.native
  
  // Clipboard Events
  var onCopy: scala.Unit | ClipboardEventHandler[T] = js.native
  
  var onCut: scala.Unit | ClipboardEventHandler[T] = js.native
  
  var onDoubleClick: scala.Unit | MouseEventHandler[T] = js.native
  
  var onDrag: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragEnd: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragEnter: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragExit: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragLeave: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragOver: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragStart: scala.Unit | DragEventHandler[T] = js.native
  
  var onDrop: scala.Unit | DragEventHandler[T] = js.native
  
  var onDurationChange: scala.Unit | ReactEventHandler[T] = js.native
  
  var onEmptied: scala.Unit | ReactEventHandler[T] = js.native
  
  var onEncrypted: scala.Unit | ReactEventHandler[T] = js.native
  
  var onEnded: scala.Unit | ReactEventHandler[T] = js.native
  
  var onError: scala.Unit | ReactEventHandler[T] = js.native
  
  // Focus Events
  var onFocus: scala.Unit | FocusEventHandler[T] = js.native
  
  var onInput: scala.Unit | FormEventHandler[T] = js.native
  
  var onInvalid: scala.Unit | FormEventHandler[T] = js.native
  
  // also a Media Event
  // Keyboard Events
  var onKeyDown: scala.Unit | KeyboardEventHandler[T] = js.native
  
  var onKeyPress: scala.Unit | KeyboardEventHandler[T] = js.native
  
  var onKeyUp: scala.Unit | KeyboardEventHandler[T] = js.native
  
  // Image Events
  var onLoad: scala.Unit | ReactEventHandler[T] = js.native
  
  var onLoadStart: scala.Unit | ReactEventHandler[T] = js.native
  
  var onLoadedData: scala.Unit | ReactEventHandler[T] = js.native
  
  var onLoadedMetadata: scala.Unit | ReactEventHandler[T] = js.native
  
  var onMouseDown: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseEnter: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseLeave: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseMove: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseOut: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseOver: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseUp: scala.Unit | MouseEventHandler[T] = js.native
  
  var onPaste: scala.Unit | ClipboardEventHandler[T] = js.native
  
  var onPause: scala.Unit | ReactEventHandler[T] = js.native
  
  var onPlay: scala.Unit | ReactEventHandler[T] = js.native
  
  var onPlaying: scala.Unit | ReactEventHandler[T] = js.native
  
  var onPointerCancel: scala.Unit | PointerEventHandler[T] = js.native
  
  // Pointer Events
  var onPointerDown: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerEnter: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerLeave: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerMove: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerOut: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerOver: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerUp: scala.Unit | PointerEventHandler[T] = js.native
  
  var onProgress: scala.Unit | ReactEventHandler[T] = js.native
  
  var onRateChange: scala.Unit | ReactEventHandler[T] = js.native
  
  var onReset: scala.Unit | FormEventHandler[T] = js.native
  
  // UI Events
  var onScroll: scala.Unit | UIEventHandler[T] = js.native
  
  var onSeeked: scala.Unit | ReactEventHandler[T] = js.native
  
  var onSeeking: scala.Unit | ReactEventHandler[T] = js.native
  
  // Selection Events
  var onSelect: scala.Unit | ReactEventHandler[T] = js.native
  
  var onStalled: scala.Unit | ReactEventHandler[T] = js.native
  
  var onSubmit: scala.Unit | FormEventHandler[T] = js.native
  
  var onSuspend: scala.Unit | ReactEventHandler[T] = js.native
  
  var onTimeUpdate: scala.Unit | ReactEventHandler[T] = js.native
  
  // Touch Events
  var onTouchCancel: scala.Unit | TouchEventHandler[T] = js.native
  
  var onTouchEnd: scala.Unit | TouchEventHandler[T] = js.native
  
  var onTouchMove: scala.Unit | TouchEventHandler[T] = js.native
  
  var onTouchStart: scala.Unit | TouchEventHandler[T] = js.native
  
  // Transition Events
  var onTransitionEnd: scala.Unit | TransitionEventHandler[T] = js.native
  
  var onVolumeChange: scala.Unit | ReactEventHandler[T] = js.native
  
  var onWaiting: scala.Unit | ReactEventHandler[T] = js.native
  
  // Wheel Events
  var onWheel: scala.Unit | WheelEventHandler[T] = js.native
}
object DOMAttributes {
  
  @scala.inline
  def apply[T](): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  
  @scala.inline
  implicit class DOMAttributesMutableBuilder[Self <: DOMAttributes[?], T] (val x: Self & DOMAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", ())
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", ())
    
    @scala.inline
    def setOnAbort(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", ())
    
    @scala.inline
    def setOnAnimationEnd(value: ReactAnimationEventFrom[T & Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", ())
    
    @scala.inline
    def setOnAnimationIteration(value: ReactAnimationEventFrom[T & Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", ())
    
    @scala.inline
    def setOnAnimationStart(value: ReactAnimationEventFrom[T & Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", ())
    
    @scala.inline
    def setOnAuxClick(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", ())
    
    @scala.inline
    def setOnBeforeInput(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", ())
    
    @scala.inline
    def setOnBlur(value: ReactFocusEventFrom[T & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", ())
    
    @scala.inline
    def setOnCanPlay(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCanPlayThrough(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", ())
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", ())
    
    @scala.inline
    def setOnChange(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", ())
    
    @scala.inline
    def setOnClick(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", ())
    
    @scala.inline
    def setOnCompositionEnd(value: ReactCompositionEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", ())
    
    @scala.inline
    def setOnCompositionStart(value: ReactCompositionEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", ())
    
    @scala.inline
    def setOnCompositionUpdate(value: ReactCompositionEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", ())
    
    @scala.inline
    def setOnContextMenu(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", ())
    
    @scala.inline
    def setOnCopy(value: ReactClipboardEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", ())
    
    @scala.inline
    def setOnCut(value: ReactClipboardEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", ())
    
    @scala.inline
    def setOnDoubleClick(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", ())
    
    @scala.inline
    def setOnDrag(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragEnd(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", ())
    
    @scala.inline
    def setOnDragEnter(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", ())
    
    @scala.inline
    def setOnDragExit(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", ())
    
    @scala.inline
    def setOnDragLeave(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", ())
    
    @scala.inline
    def setOnDragOver(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", ())
    
    @scala.inline
    def setOnDragStart(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", ())
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", ())
    
    @scala.inline
    def setOnDrop(value: ReactDragEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", ())
    
    @scala.inline
    def setOnDurationChange(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", ())
    
    @scala.inline
    def setOnEmptied(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", ())
    
    @scala.inline
    def setOnEncrypted(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", ())
    
    @scala.inline
    def setOnEnded(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", ())
    
    @scala.inline
    def setOnError(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", ())
    
    @scala.inline
    def setOnFocus(value: ReactFocusEventFrom[T & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", ())
    
    @scala.inline
    def setOnInput(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", ())
    
    @scala.inline
    def setOnInvalid(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", ())
    
    @scala.inline
    def setOnKeyDown(value: ReactKeyboardEventFrom[T & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", ())
    
    @scala.inline
    def setOnKeyPress(value: ReactKeyboardEventFrom[T & Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", ())
    
    @scala.inline
    def setOnKeyUp(value: ReactKeyboardEventFrom[T & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", ())
    
    @scala.inline
    def setOnLoad(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadStart(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", ())
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", ())
    
    @scala.inline
    def setOnLoadedData(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", ())
    
    @scala.inline
    def setOnLoadedMetadata(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", ())
    
    @scala.inline
    def setOnMouseDown(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", ())
    
    @scala.inline
    def setOnMouseEnter(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", ())
    
    @scala.inline
    def setOnMouseLeave(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", ())
    
    @scala.inline
    def setOnMouseMove(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", ())
    
    @scala.inline
    def setOnMouseOut(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", ())
    
    @scala.inline
    def setOnMouseOver(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", ())
    
    @scala.inline
    def setOnMouseUp(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", ())
    
    @scala.inline
    def setOnPaste(value: ReactClipboardEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", ())
    
    @scala.inline
    def setOnPause(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", ())
    
    @scala.inline
    def setOnPlay(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", ())
    
    @scala.inline
    def setOnPlaying(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", ())
    
    @scala.inline
    def setOnPointerCancel(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", ())
    
    @scala.inline
    def setOnPointerDown(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", ())
    
    @scala.inline
    def setOnPointerEnter(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", ())
    
    @scala.inline
    def setOnPointerLeave(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", ())
    
    @scala.inline
    def setOnPointerMove(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", ())
    
    @scala.inline
    def setOnPointerOut(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", ())
    
    @scala.inline
    def setOnPointerOver(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", ())
    
    @scala.inline
    def setOnPointerUp(value: ReactPointerEventFrom[T & Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", ())
    
    @scala.inline
    def setOnProgress(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", ())
    
    @scala.inline
    def setOnRateChange(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", ())
    
    @scala.inline
    def setOnReset(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", ())
    
    @scala.inline
    def setOnScroll(value: ReactUIEventFrom[T & Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", ())
    
    @scala.inline
    def setOnSeeked(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", ())
    
    @scala.inline
    def setOnSeeking(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", ())
    
    @scala.inline
    def setOnSelect(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", ())
    
    @scala.inline
    def setOnStalled(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", ())
    
    @scala.inline
    def setOnSubmit(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", ())
    
    @scala.inline
    def setOnSuspend(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", ())
    
    @scala.inline
    def setOnTimeUpdate(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", ())
    
    @scala.inline
    def setOnTouchCancel(value: ReactTouchEventFrom[T & Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", ())
    
    @scala.inline
    def setOnTouchEnd(value: ReactTouchEventFrom[T & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", ())
    
    @scala.inline
    def setOnTouchMove(value: ReactTouchEventFrom[T & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", ())
    
    @scala.inline
    def setOnTouchStart(value: ReactTouchEventFrom[T & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", ())
    
    @scala.inline
    def setOnTransitionEnd(value: ReactTransitionEventFrom[T & Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", ())
    
    @scala.inline
    def setOnVolumeChange(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", ())
    
    @scala.inline
    def setOnWaiting(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", ())
    
    @scala.inline
    def setOnWheel(value: ReactWheelEventFrom[T & Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", ())
  }
}
