package typings.vueResource

import org.scalablytyped.runtime.StringDictionary
import typings.vueResource.vuejs.HttpHeaders
import typings.vueResource.vuejs.HttpOptions
import typings.vueResource.vuejs.HttpResponse
import typings.vueResource.vuejs.http
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(options: HttpOptions): js.Thenable[HttpResponse] = js.native
    
    def delete(url: String): js.Thenable[HttpResponse] = js.native
    def delete(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def delete(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def delete(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def delete(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("delete")
    var delete_Original: http = js.native
    
    def get(url: String): js.Thenable[HttpResponse] = js.native
    def get(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def get(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def get(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def get(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("get")
    var get_Original: http = js.native
    
    def jsonp(url: String): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("jsonp")
    var jsonp_Original: http = js.native
    
    def patch(url: String): js.Thenable[HttpResponse] = js.native
    def patch(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def patch(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def patch(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def patch(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("patch")
    var patch_Original: http = js.native
    
    def post(url: String): js.Thenable[HttpResponse] = js.native
    def post(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def post(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def post(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def post(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("post")
    var post_Original: http = js.native
    
    def put(url: String): js.Thenable[HttpResponse] = js.native
    def put(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def put(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def put(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def put(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("put")
    var put_Original: http = js.native
  }
  
  /* Inlined vue-resource.vuejs.HttpOptions & {  root :string} */
  @js.native
  trait HttpOptionsrootstring extends StObject {
    
    var before: scala.Unit | (js.Function1[/* request */ js.Any, ?]) = js.native
    
    var body: scala.Unit | js.Any = js.native
    
    var credentials: scala.Unit | Boolean = js.native
    
    var emulateHTTP: scala.Unit | Boolean = js.native
    
    var emulateJSON: scala.Unit | Boolean = js.native
    
    var headers: scala.Unit | js.Any = js.native
    
    var method: scala.Unit | String = js.native
    
    var params: scala.Unit | js.Any = js.native
    
    var progress: scala.Unit | (js.Function1[/* event */ js.Any, ?]) = js.native
    
    var root: String = js.native
    
    var url: scala.Unit | String = js.native
  }
  object HttpOptionsrootstring {
    
    @scala.inline
    def apply(root: String): HttpOptionsrootstring = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpOptionsrootstring]
    }
    
    @scala.inline
    implicit class HttpOptionsrootstringMutableBuilder[Self <: HttpOptionsrootstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: /* request */ js.Any => ?): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", ())
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", ())
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", ())
      
      @scala.inline
      def setEmulateHTTP(value: Boolean): Self = StObject.set(x, "emulateHTTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulateHTTPUndefined: Self = StObject.set(x, "emulateHTTP", ())
      
      @scala.inline
      def setEmulateJSON(value: Boolean): Self = StObject.set(x, "emulateJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulateJSONUndefined: Self = StObject.set(x, "emulateJSON", ())
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", ())
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", ())
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", ())
      
      @scala.inline
      def setProgress(value: /* event */ js.Any => ?): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", ())
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", ())
    }
  }
  
  @js.native
  trait Method extends StObject {
    
    var method: String = js.native
  }
  object Method {
    
    @scala.inline
    def apply(method: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  headers :vue-resource.vuejs.HttpHeaders | undefined, [key: string] : any} & vue-resource.vuejs.HttpOptions */
  @js.native
  trait headersHttpHeadersundefin
    extends /* key */ StringDictionary[js.Any] {
    
    var before: scala.Unit | (js.Function1[/* request */ js.Any, ?]) = js.native
    
    var body: scala.Unit | js.Any = js.native
    
    var credentials: scala.Unit | Boolean = js.native
    
    var emulateHTTP: scala.Unit | Boolean = js.native
    
    var emulateJSON: scala.Unit | Boolean = js.native
    
    var headers: (scala.Unit | HttpHeaders) & (scala.Unit | js.Any) = js.native
    
    var method: scala.Unit | String = js.native
    
    var params: scala.Unit | js.Any = js.native
    
    var progress: scala.Unit | (js.Function1[/* event */ js.Any, ?]) = js.native
    
    var url: scala.Unit | String = js.native
  }
  object headersHttpHeadersundefin {
    
    @scala.inline
    def apply(headers: (scala.Unit | HttpHeaders) & (scala.Unit | js.Any)): headersHttpHeadersundefin = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[headersHttpHeadersundefin]
    }
    
    @scala.inline
    implicit class headersHttpHeadersundefinMutableBuilder[Self <: headersHttpHeadersundefin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: /* request */ js.Any => ?): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", ())
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", ())
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", ())
      
      @scala.inline
      def setEmulateHTTP(value: Boolean): Self = StObject.set(x, "emulateHTTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulateHTTPUndefined: Self = StObject.set(x, "emulateHTTP", ())
      
      @scala.inline
      def setEmulateJSON(value: Boolean): Self = StObject.set(x, "emulateJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulateJSONUndefined: Self = StObject.set(x, "emulateJSON", ())
      
      @scala.inline
      def setHeaders(value: (scala.Unit | HttpHeaders) & (scala.Unit | js.Any)): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", ())
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", ())
      
      @scala.inline
      def setProgress(value: /* event */ js.Any => ?): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", ())
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", ())
    }
  }
}
