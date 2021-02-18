package typingsJapgolly.react.mod

import typingsJapgolly.react.reactStrings.`after-edge`
import typingsJapgolly.react.reactStrings.`before-edge`
import typingsJapgolly.react.reactStrings.`text-after-edge`
import typingsJapgolly.react.reactStrings.`text-before-edge`
import typingsJapgolly.react.reactStrings.alphabetic
import typingsJapgolly.react.reactStrings.auto
import typingsJapgolly.react.reactStrings.baseline
import typingsJapgolly.react.reactStrings.bevel
import typingsJapgolly.react.reactStrings.butt
import typingsJapgolly.react.reactStrings.central
import typingsJapgolly.react.reactStrings.evenodd
import typingsJapgolly.react.reactStrings.hanging
import typingsJapgolly.react.reactStrings.ideographic
import typingsJapgolly.react.reactStrings.inherit
import typingsJapgolly.react.reactStrings.initial
import typingsJapgolly.react.reactStrings.isolated
import typingsJapgolly.react.reactStrings.linearRGB
import typingsJapgolly.react.reactStrings.mathematical
import typingsJapgolly.react.reactStrings.medial
import typingsJapgolly.react.reactStrings.middle
import typingsJapgolly.react.reactStrings.miter
import typingsJapgolly.react.reactStrings.no
import typingsJapgolly.react.reactStrings.none
import typingsJapgolly.react.reactStrings.nonzero
import typingsJapgolly.react.reactStrings.replace
import typingsJapgolly.react.reactStrings.round
import typingsJapgolly.react.reactStrings.sRGB
import typingsJapgolly.react.reactStrings.square
import typingsJapgolly.react.reactStrings.sum
import typingsJapgolly.react.reactStrings.terminal
import typingsJapgolly.react.reactStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// this list is "complete" in that it contains every SVG attribute
// that React supports, but the types can be improved.
// Full list here: https://facebook.github.io/react/docs/dom-elements.html
//
// The three broad type categories are (in order of restrictiveness):
//   - "number | string"
//   - "string"
//   - union of string literals
@js.native
trait SVGAttributes[T]
  extends AriaAttributes
     with DOMAttributes[T] {
  
  // SVG Specific attributes
  var accentHeight: scala.Unit | Double | String = js.native
  
  var accumulate: scala.Unit | none | sum = js.native
  
  var additive: scala.Unit | replace | sum = js.native
  
  var alignmentBaseline: scala.Unit | auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit = js.native
  
  var allowReorder: scala.Unit | no | yes = js.native
  
  var alphabetic: scala.Unit | Double | String = js.native
  
  var amplitude: scala.Unit | Double | String = js.native
  
  var arabicForm: scala.Unit | initial | medial | terminal | isolated = js.native
  
  var ascent: scala.Unit | Double | String = js.native
  
  var attributeName: scala.Unit | String = js.native
  
  var attributeType: scala.Unit | String = js.native
  
  var autoReverse: scala.Unit | Double | String = js.native
  
  var azimuth: scala.Unit | Double | String = js.native
  
  var baseFrequency: scala.Unit | Double | String = js.native
  
  var baseProfile: scala.Unit | Double | String = js.native
  
  var baselineShift: scala.Unit | Double | String = js.native
  
  var bbox: scala.Unit | Double | String = js.native
  
  var begin: scala.Unit | Double | String = js.native
  
  var bias: scala.Unit | Double | String = js.native
  
  var by: scala.Unit | Double | String = js.native
  
  var calcMode: scala.Unit | Double | String = js.native
  
  var capHeight: scala.Unit | Double | String = js.native
  
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: scala.Unit | String = js.native
  
  var clip: scala.Unit | Double | String = js.native
  
  var clipPath: scala.Unit | String = js.native
  
  var clipPathUnits: scala.Unit | Double | String = js.native
  
  var clipRule: scala.Unit | Double | String = js.native
  
  var color: scala.Unit | String = js.native
  
  var colorInterpolation: scala.Unit | Double | String = js.native
  
  var colorInterpolationFilters: scala.Unit | auto | sRGB | linearRGB | inherit = js.native
  
  var colorProfile: scala.Unit | Double | String = js.native
  
  var colorRendering: scala.Unit | Double | String = js.native
  
  var contentScriptType: scala.Unit | Double | String = js.native
  
  var contentStyleType: scala.Unit | Double | String = js.native
  
  var cursor: scala.Unit | Double | String = js.native
  
  var cx: scala.Unit | Double | String = js.native
  
  var cy: scala.Unit | Double | String = js.native
  
  var d: scala.Unit | String = js.native
  
  var decelerate: scala.Unit | Double | String = js.native
  
  var descent: scala.Unit | Double | String = js.native
  
  var diffuseConstant: scala.Unit | Double | String = js.native
  
  var direction: scala.Unit | Double | String = js.native
  
  var display: scala.Unit | Double | String = js.native
  
  var divisor: scala.Unit | Double | String = js.native
  
  var dominantBaseline: scala.Unit | Double | String = js.native
  
  var dur: scala.Unit | Double | String = js.native
  
  var dx: scala.Unit | Double | String = js.native
  
  var dy: scala.Unit | Double | String = js.native
  
  var edgeMode: scala.Unit | Double | String = js.native
  
  var elevation: scala.Unit | Double | String = js.native
  
  var enableBackground: scala.Unit | Double | String = js.native
  
  var end: scala.Unit | Double | String = js.native
  
  var exponent: scala.Unit | Double | String = js.native
  
  var externalResourcesRequired: scala.Unit | Double | String = js.native
  
  var fill: scala.Unit | String = js.native
  
  var fillOpacity: scala.Unit | Double | String = js.native
  
  var fillRule: scala.Unit | nonzero | evenodd | inherit = js.native
  
  var filter: scala.Unit | String = js.native
  
  var filterRes: scala.Unit | Double | String = js.native
  
  var filterUnits: scala.Unit | Double | String = js.native
  
  var floodColor: scala.Unit | Double | String = js.native
  
  var floodOpacity: scala.Unit | Double | String = js.native
  
  var focusable: scala.Unit | Double | String = js.native
  
  var fontFamily: scala.Unit | String = js.native
  
  var fontSize: scala.Unit | Double | String = js.native
  
  var fontSizeAdjust: scala.Unit | Double | String = js.native
  
  var fontStretch: scala.Unit | Double | String = js.native
  
  var fontStyle: scala.Unit | Double | String = js.native
  
  var fontVariant: scala.Unit | Double | String = js.native
  
  var fontWeight: scala.Unit | Double | String = js.native
  
  var format: scala.Unit | Double | String = js.native
  
  var from: scala.Unit | Double | String = js.native
  
  var fx: scala.Unit | Double | String = js.native
  
  var fy: scala.Unit | Double | String = js.native
  
  var g1: scala.Unit | Double | String = js.native
  
  var g2: scala.Unit | Double | String = js.native
  
  var glyphName: scala.Unit | Double | String = js.native
  
  var glyphOrientationHorizontal: scala.Unit | Double | String = js.native
  
  var glyphOrientationVertical: scala.Unit | Double | String = js.native
  
  var glyphRef: scala.Unit | Double | String = js.native
  
  var gradientTransform: scala.Unit | String = js.native
  
  var gradientUnits: scala.Unit | String = js.native
  
  var hanging: scala.Unit | Double | String = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var horizAdvX: scala.Unit | Double | String = js.native
  
  var horizOriginX: scala.Unit | Double | String = js.native
  
  var href: scala.Unit | String = js.native
  
  var id: scala.Unit | String = js.native
  
  var ideographic: scala.Unit | Double | String = js.native
  
  var imageRendering: scala.Unit | Double | String = js.native
  
  var in: scala.Unit | String = js.native
  
  var in2: scala.Unit | Double | String = js.native
  
  var intercept: scala.Unit | Double | String = js.native
  
  var k: scala.Unit | Double | String = js.native
  
  var k1: scala.Unit | Double | String = js.native
  
  var k2: scala.Unit | Double | String = js.native
  
  var k3: scala.Unit | Double | String = js.native
  
  var k4: scala.Unit | Double | String = js.native
  
  var kernelMatrix: scala.Unit | Double | String = js.native
  
  var kernelUnitLength: scala.Unit | Double | String = js.native
  
  var kerning: scala.Unit | Double | String = js.native
  
  var keyPoints: scala.Unit | Double | String = js.native
  
  var keySplines: scala.Unit | Double | String = js.native
  
  var keyTimes: scala.Unit | Double | String = js.native
  
  var lang: scala.Unit | String = js.native
  
  var lengthAdjust: scala.Unit | Double | String = js.native
  
  var letterSpacing: scala.Unit | Double | String = js.native
  
  var lightingColor: scala.Unit | Double | String = js.native
  
  var limitingConeAngle: scala.Unit | Double | String = js.native
  
  var local: scala.Unit | Double | String = js.native
  
  var markerEnd: scala.Unit | String = js.native
  
  var markerHeight: scala.Unit | Double | String = js.native
  
  var markerMid: scala.Unit | String = js.native
  
  var markerStart: scala.Unit | String = js.native
  
  var markerUnits: scala.Unit | Double | String = js.native
  
  var markerWidth: scala.Unit | Double | String = js.native
  
  var mask: scala.Unit | String = js.native
  
  var maskContentUnits: scala.Unit | Double | String = js.native
  
  var maskUnits: scala.Unit | Double | String = js.native
  
  var mathematical: scala.Unit | Double | String = js.native
  
  var max: scala.Unit | Double | String = js.native
  
  var media: scala.Unit | String = js.native
  
  var method: scala.Unit | String = js.native
  
  var min: scala.Unit | Double | String = js.native
  
  var mode: scala.Unit | Double | String = js.native
  
  var name: scala.Unit | String = js.native
  
  var numOctaves: scala.Unit | Double | String = js.native
  
  var offset: scala.Unit | Double | String = js.native
  
  var opacity: scala.Unit | Double | String = js.native
  
  var operator: scala.Unit | Double | String = js.native
  
  var order: scala.Unit | Double | String = js.native
  
  var orient: scala.Unit | Double | String = js.native
  
  var orientation: scala.Unit | Double | String = js.native
  
  var origin: scala.Unit | Double | String = js.native
  
  var overflow: scala.Unit | Double | String = js.native
  
  var overlinePosition: scala.Unit | Double | String = js.native
  
  var overlineThickness: scala.Unit | Double | String = js.native
  
  var paintOrder: scala.Unit | Double | String = js.native
  
  var panose1: scala.Unit | Double | String = js.native
  
  var pathLength: scala.Unit | Double | String = js.native
  
  var patternContentUnits: scala.Unit | String = js.native
  
  var patternTransform: scala.Unit | Double | String = js.native
  
  var patternUnits: scala.Unit | String = js.native
  
  var pointerEvents: scala.Unit | Double | String = js.native
  
  var points: scala.Unit | String = js.native
  
  var pointsAtX: scala.Unit | Double | String = js.native
  
  var pointsAtY: scala.Unit | Double | String = js.native
  
  var pointsAtZ: scala.Unit | Double | String = js.native
  
  var preserveAlpha: scala.Unit | Double | String = js.native
  
  var preserveAspectRatio: scala.Unit | String = js.native
  
  var primitiveUnits: scala.Unit | Double | String = js.native
  
  var r: scala.Unit | Double | String = js.native
  
  var radius: scala.Unit | Double | String = js.native
  
  var refX: scala.Unit | Double | String = js.native
  
  var refY: scala.Unit | Double | String = js.native
  
  var renderingIntent: scala.Unit | Double | String = js.native
  
  var repeatCount: scala.Unit | Double | String = js.native
  
  var repeatDur: scala.Unit | Double | String = js.native
  
  var requiredExtensions: scala.Unit | Double | String = js.native
  
  var requiredFeatures: scala.Unit | Double | String = js.native
  
  var restart: scala.Unit | Double | String = js.native
  
  var result: scala.Unit | String = js.native
  
  // Other HTML properties supported by SVG elements in browsers
  var role: scala.Unit | String = js.native
  
  var rotate: scala.Unit | Double | String = js.native
  
  var rx: scala.Unit | Double | String = js.native
  
  var ry: scala.Unit | Double | String = js.native
  
  var scale: scala.Unit | Double | String = js.native
  
  var seed: scala.Unit | Double | String = js.native
  
  var shapeRendering: scala.Unit | Double | String = js.native
  
  var slope: scala.Unit | Double | String = js.native
  
  var spacing: scala.Unit | Double | String = js.native
  
  var specularConstant: scala.Unit | Double | String = js.native
  
  var specularExponent: scala.Unit | Double | String = js.native
  
  var speed: scala.Unit | Double | String = js.native
  
  var spreadMethod: scala.Unit | String = js.native
  
  var startOffset: scala.Unit | Double | String = js.native
  
  var stdDeviation: scala.Unit | Double | String = js.native
  
  var stemh: scala.Unit | Double | String = js.native
  
  var stemv: scala.Unit | Double | String = js.native
  
  var stitchTiles: scala.Unit | Double | String = js.native
  
  var stopColor: scala.Unit | String = js.native
  
  var stopOpacity: scala.Unit | Double | String = js.native
  
  var strikethroughPosition: scala.Unit | Double | String = js.native
  
  var strikethroughThickness: scala.Unit | Double | String = js.native
  
  var string: scala.Unit | Double | String = js.native
  
  var stroke: scala.Unit | String = js.native
  
  var strokeDasharray: scala.Unit | String | Double = js.native
  
  var strokeDashoffset: scala.Unit | String | Double = js.native
  
  var strokeLinecap: scala.Unit | butt | round | square | inherit = js.native
  
  var strokeLinejoin: scala.Unit | miter | round | bevel | inherit = js.native
  
  var strokeMiterlimit: scala.Unit | Double | String = js.native
  
  var strokeOpacity: scala.Unit | Double | String = js.native
  
  var strokeWidth: scala.Unit | Double | String = js.native
  
  var style: scala.Unit | CSSProperties = js.native
  
  var surfaceScale: scala.Unit | Double | String = js.native
  
  var systemLanguage: scala.Unit | Double | String = js.native
  
  var tabIndex: scala.Unit | Double = js.native
  
  var tableValues: scala.Unit | Double | String = js.native
  
  var target: scala.Unit | String = js.native
  
  var targetX: scala.Unit | Double | String = js.native
  
  var targetY: scala.Unit | Double | String = js.native
  
  var textAnchor: scala.Unit | String = js.native
  
  var textDecoration: scala.Unit | Double | String = js.native
  
  var textLength: scala.Unit | Double | String = js.native
  
  var textRendering: scala.Unit | Double | String = js.native
  
  var to: scala.Unit | Double | String = js.native
  
  var transform: scala.Unit | String = js.native
  
  var `type`: scala.Unit | String = js.native
  
  var u1: scala.Unit | Double | String = js.native
  
  var u2: scala.Unit | Double | String = js.native
  
  var underlinePosition: scala.Unit | Double | String = js.native
  
  var underlineThickness: scala.Unit | Double | String = js.native
  
  var unicode: scala.Unit | Double | String = js.native
  
  var unicodeBidi: scala.Unit | Double | String = js.native
  
  var unicodeRange: scala.Unit | Double | String = js.native
  
  var unitsPerEm: scala.Unit | Double | String = js.native
  
  var vAlphabetic: scala.Unit | Double | String = js.native
  
  var vHanging: scala.Unit | Double | String = js.native
  
  var vIdeographic: scala.Unit | Double | String = js.native
  
  var vMathematical: scala.Unit | Double | String = js.native
  
  var values: scala.Unit | String = js.native
  
  var vectorEffect: scala.Unit | Double | String = js.native
  
  var version: scala.Unit | String = js.native
  
  var vertAdvY: scala.Unit | Double | String = js.native
  
  var vertOriginX: scala.Unit | Double | String = js.native
  
  var vertOriginY: scala.Unit | Double | String = js.native
  
  var viewBox: scala.Unit | String = js.native
  
  var viewTarget: scala.Unit | Double | String = js.native
  
  var visibility: scala.Unit | Double | String = js.native
  
  var width: scala.Unit | Double | String = js.native
  
  var widths: scala.Unit | Double | String = js.native
  
  var wordSpacing: scala.Unit | Double | String = js.native
  
  var writingMode: scala.Unit | Double | String = js.native
  
  var x: scala.Unit | Double | String = js.native
  
  var x1: scala.Unit | Double | String = js.native
  
  var x2: scala.Unit | Double | String = js.native
  
  var xChannelSelector: scala.Unit | String = js.native
  
  var xHeight: scala.Unit | Double | String = js.native
  
  var xlinkActuate: scala.Unit | String = js.native
  
  var xlinkArcrole: scala.Unit | String = js.native
  
  var xlinkHref: scala.Unit | String = js.native
  
  var xlinkRole: scala.Unit | String = js.native
  
  var xlinkShow: scala.Unit | String = js.native
  
  var xlinkTitle: scala.Unit | String = js.native
  
  var xlinkType: scala.Unit | String = js.native
  
  var xmlBase: scala.Unit | String = js.native
  
  var xmlLang: scala.Unit | String = js.native
  
  var xmlSpace: scala.Unit | String = js.native
  
  var xmlns: scala.Unit | String = js.native
  
  var xmlnsXlink: scala.Unit | String = js.native
  
  var y: scala.Unit | Double | String = js.native
  
  var y1: scala.Unit | Double | String = js.native
  
  var y2: scala.Unit | Double | String = js.native
  
  var yChannelSelector: scala.Unit | String = js.native
  
  var z: scala.Unit | Double | String = js.native
  
  var zoomAndPan: scala.Unit | String = js.native
}
object SVGAttributes {
  
  @scala.inline
  def apply[T](): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributes[T]]
  }
  
  @scala.inline
  implicit class SVGAttributesMutableBuilder[Self <: SVGAttributes[?], T] (val x: Self & SVGAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", ())
    
    @scala.inline
    def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccumulateUndefined: Self = StObject.set(x, "accumulate", ())
    
    @scala.inline
    def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditiveUndefined: Self = StObject.set(x, "additive", ())
    
    @scala.inline
    def setAlignmentBaseline(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", ())
    
    @scala.inline
    def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", ())
    
    @scala.inline
    def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", ())
    
    @scala.inline
    def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", ())
    
    @scala.inline
    def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", ())
    
    @scala.inline
    def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscentUndefined: Self = StObject.set(x, "ascent", ())
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", ())
    
    @scala.inline
    def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", ())
    
    @scala.inline
    def setAutoReverse(value: Double | String): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", ())
    
    @scala.inline
    def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzimuthUndefined: Self = StObject.set(x, "azimuth", ())
    
    @scala.inline
    def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", ())
    
    @scala.inline
    def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", ())
    
    @scala.inline
    def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", ())
    
    @scala.inline
    def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBboxUndefined: Self = StObject.set(x, "bbox", ())
    
    @scala.inline
    def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", ())
    
    @scala.inline
    def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", ())
    
    @scala.inline
    def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", ())
    
    @scala.inline
    def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalcModeUndefined: Self = StObject.set(x, "calcMode", ())
    
    @scala.inline
    def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapHeightUndefined: Self = StObject.set(x, "capHeight", ())
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", ())
    
    @scala.inline
    def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUndefined: Self = StObject.set(x, "clipPath", ())
    
    @scala.inline
    def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", ())
    
    @scala.inline
    def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", ())
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", ())
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", ())
    
    @scala.inline
    def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", ())
    
    @scala.inline
    def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", ())
    
    @scala.inline
    def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", ())
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", ())
    
    @scala.inline
    def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", ())
    
    @scala.inline
    def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", ())
    
    @scala.inline
    def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", ())
    
    @scala.inline
    def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", ())
    
    @scala.inline
    def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", ())
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", ())
    
    @scala.inline
    def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerateUndefined: Self = StObject.set(x, "decelerate", ())
    
    @scala.inline
    def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescentUndefined: Self = StObject.set(x, "descent", ())
    
    @scala.inline
    def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", ())
    
    @scala.inline
    def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", ())
    
    @scala.inline
    def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", ())
    
    @scala.inline
    def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisorUndefined: Self = StObject.set(x, "divisor", ())
    
    @scala.inline
    def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", ())
    
    @scala.inline
    def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurUndefined: Self = StObject.set(x, "dur", ())
    
    @scala.inline
    def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", ())
    
    @scala.inline
    def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", ())
    
    @scala.inline
    def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", ())
    
    @scala.inline
    def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", ())
    
    @scala.inline
    def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", ())
    
    @scala.inline
    def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", ())
    
    @scala.inline
    def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentUndefined: Self = StObject.set(x, "exponent", ())
    
    @scala.inline
    def setExternalResourcesRequired(value: Double | String): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", ())
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", ())
    
    @scala.inline
    def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", ())
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", ())
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterResUndefined: Self = StObject.set(x, "filterRes", ())
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", ())
    
    @scala.inline
    def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", ())
    
    @scala.inline
    def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodColorUndefined: Self = StObject.set(x, "floodColor", ())
    
    @scala.inline
    def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", ())
    
    @scala.inline
    def setFocusable(value: Double | String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", ())
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", ())
    
    @scala.inline
    def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", ())
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", ())
    
    @scala.inline
    def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", ())
    
    @scala.inline
    def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", ())
    
    @scala.inline
    def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", ())
    
    @scala.inline
    def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", ())
    
    @scala.inline
    def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", ())
    
    @scala.inline
    def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", ())
    
    @scala.inline
    def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", ())
    
    @scala.inline
    def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFyUndefined: Self = StObject.set(x, "fy", ())
    
    @scala.inline
    def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG1Undefined: Self = StObject.set(x, "g1", ())
    
    @scala.inline
    def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG2Undefined: Self = StObject.set(x, "g2", ())
    
    @scala.inline
    def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", ())
    
    @scala.inline
    def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", ())
    
    @scala.inline
    def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", ())
    
    @scala.inline
    def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", ())
    
    @scala.inline
    def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", ())
    
    @scala.inline
    def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", ())
    
    @scala.inline
    def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangingUndefined: Self = StObject.set(x, "hanging", ())
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", ())
    
    @scala.inline
    def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", ())
    
    @scala.inline
    def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", ())
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", ())
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", ())
    
    @scala.inline
    def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeographicUndefined: Self = StObject.set(x, "ideographic", ())
    
    @scala.inline
    def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", ())
    
    @scala.inline
    def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn2Undefined: Self = StObject.set(x, "in2", ())
    
    @scala.inline
    def setInUndefined: Self = StObject.set(x, "in", ())
    
    @scala.inline
    def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptUndefined: Self = StObject.set(x, "intercept", ())
    
    @scala.inline
    def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK1Undefined: Self = StObject.set(x, "k1", ())
    
    @scala.inline
    def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK2Undefined: Self = StObject.set(x, "k2", ())
    
    @scala.inline
    def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK3Undefined: Self = StObject.set(x, "k3", ())
    
    @scala.inline
    def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK4Undefined: Self = StObject.set(x, "k4", ())
    
    @scala.inline
    def setKUndefined: Self = StObject.set(x, "k", ())
    
    @scala.inline
    def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", ())
    
    @scala.inline
    def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", ())
    
    @scala.inline
    def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningUndefined: Self = StObject.set(x, "kerning", ())
    
    @scala.inline
    def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", ())
    
    @scala.inline
    def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", ())
    
    @scala.inline
    def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", ())
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", ())
    
    @scala.inline
    def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", ())
    
    @scala.inline
    def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", ())
    
    @scala.inline
    def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", ())
    
    @scala.inline
    def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", ())
    
    @scala.inline
    def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", ())
    
    @scala.inline
    def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", ())
    
    @scala.inline
    def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", ())
    
    @scala.inline
    def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", ())
    
    @scala.inline
    def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", ())
    
    @scala.inline
    def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", ())
    
    @scala.inline
    def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", ())
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", ())
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", ())
    
    @scala.inline
    def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", ())
    
    @scala.inline
    def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathematicalUndefined: Self = StObject.set(x, "mathematical", ())
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", ())
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", ())
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", ())
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", ())
    
    @scala.inline
    def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", ())
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", ())
    
    @scala.inline
    def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", ())
    
    @scala.inline
    def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", ())
    
    @scala.inline
    def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", ())
    
    @scala.inline
    def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", ())
    
    @scala.inline
    def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", ())
    
    @scala.inline
    def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", ())
    
    @scala.inline
    def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", ())
    
    @scala.inline
    def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", ())
    
    @scala.inline
    def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", ())
    
    @scala.inline
    def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", ())
    
    @scala.inline
    def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", ())
    
    @scala.inline
    def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", ())
    
    @scala.inline
    def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanose1Undefined: Self = StObject.set(x, "panose1", ())
    
    @scala.inline
    def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLengthUndefined: Self = StObject.set(x, "pathLength", ())
    
    @scala.inline
    def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", ())
    
    @scala.inline
    def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", ())
    
    @scala.inline
    def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", ())
    
    @scala.inline
    def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", ())
    
    @scala.inline
    def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", ())
    
    @scala.inline
    def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", ())
    
    @scala.inline
    def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", ())
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", ())
    
    @scala.inline
    def setPreserveAlpha(value: Double | String): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", ())
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", ())
    
    @scala.inline
    def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", ())
    
    @scala.inline
    def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", ())
    
    @scala.inline
    def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", ())
    
    @scala.inline
    def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefXUndefined: Self = StObject.set(x, "refX", ())
    
    @scala.inline
    def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefYUndefined: Self = StObject.set(x, "refY", ())
    
    @scala.inline
    def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", ())
    
    @scala.inline
    def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", ())
    
    @scala.inline
    def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", ())
    
    @scala.inline
    def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", ())
    
    @scala.inline
    def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", ())
    
    @scala.inline
    def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartUndefined: Self = StObject.set(x, "restart", ())
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", ())
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", ())
    
    @scala.inline
    def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", ())
    
    @scala.inline
    def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", ())
    
    @scala.inline
    def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", ())
    
    @scala.inline
    def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", ())
    
    @scala.inline
    def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", ())
    
    @scala.inline
    def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", ())
    
    @scala.inline
    def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlopeUndefined: Self = StObject.set(x, "slope", ())
    
    @scala.inline
    def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", ())
    
    @scala.inline
    def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", ())
    
    @scala.inline
    def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", ())
    
    @scala.inline
    def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", ())
    
    @scala.inline
    def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", ())
    
    @scala.inline
    def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", ())
    
    @scala.inline
    def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", ())
    
    @scala.inline
    def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemhUndefined: Self = StObject.set(x, "stemh", ())
    
    @scala.inline
    def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemvUndefined: Self = StObject.set(x, "stemv", ())
    
    @scala.inline
    def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", ())
    
    @scala.inline
    def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", ())
    
    @scala.inline
    def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", ())
    
    @scala.inline
    def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", ())
    
    @scala.inline
    def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", ())
    
    @scala.inline
    def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", ())
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", ())
    
    @scala.inline
    def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", ())
    
    @scala.inline
    def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", ())
    
    @scala.inline
    def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", ())
    
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", ())
    
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", ())
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", ())
    
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", ())
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", ())
    
    @scala.inline
    def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", ())
    
    @scala.inline
    def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", ())
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", ())
    
    @scala.inline
    def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableValuesUndefined: Self = StObject.set(x, "tableValues", ())
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", ())
    
    @scala.inline
    def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetXUndefined: Self = StObject.set(x, "targetX", ())
    
    @scala.inline
    def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetYUndefined: Self = StObject.set(x, "targetY", ())
    
    @scala.inline
    def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", ())
    
    @scala.inline
    def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", ())
    
    @scala.inline
    def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLengthUndefined: Self = StObject.set(x, "textLength", ())
    
    @scala.inline
    def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", ())
    
    @scala.inline
    def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", ())
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", ())
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", ())
    
    @scala.inline
    def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU1Undefined: Self = StObject.set(x, "u1", ())
    
    @scala.inline
    def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU2Undefined: Self = StObject.set(x, "u2", ())
    
    @scala.inline
    def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", ())
    
    @scala.inline
    def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", ())
    
    @scala.inline
    def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", ())
    
    @scala.inline
    def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", ())
    
    @scala.inline
    def setUnicodeUndefined: Self = StObject.set(x, "unicode", ())
    
    @scala.inline
    def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", ())
    
    @scala.inline
    def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", ())
    
    @scala.inline
    def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVHangingUndefined: Self = StObject.set(x, "vHanging", ())
    
    @scala.inline
    def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", ())
    
    @scala.inline
    def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", ())
    
    @scala.inline
    def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", ())
    
    @scala.inline
    def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", ())
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", ())
    
    @scala.inline
    def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", ())
    
    @scala.inline
    def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", ())
    
    @scala.inline
    def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", ())
    
    @scala.inline
    def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", ())
    
    @scala.inline
    def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", ())
    
    @scala.inline
    def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", ())
    
    @scala.inline
    def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthsUndefined: Self = StObject.set(x, "widths", ())
    
    @scala.inline
    def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", ())
    
    @scala.inline
    def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingModeUndefined: Self = StObject.set(x, "writingMode", ())
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", ())
    
    @scala.inline
    def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", ())
    
    @scala.inline
    def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", ())
    
    @scala.inline
    def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHeightUndefined: Self = StObject.set(x, "xHeight", ())
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", ())
    
    @scala.inline
    def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", ())
    
    @scala.inline
    def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", ())
    
    @scala.inline
    def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", ())
    
    @scala.inline
    def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", ())
    
    @scala.inline
    def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", ())
    
    @scala.inline
    def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", ())
    
    @scala.inline
    def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", ())
    
    @scala.inline
    def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", ())
    
    @scala.inline
    def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", ())
    
    @scala.inline
    def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", ())
    
    @scala.inline
    def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsUndefined: Self = StObject.set(x, "xmlns", ())
    
    @scala.inline
    def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", ())
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", ())
    
    @scala.inline
    def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", ())
    
    @scala.inline
    def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", ())
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", ())
    
    @scala.inline
    def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", ())
    
    @scala.inline
    def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", ())
  }
}
