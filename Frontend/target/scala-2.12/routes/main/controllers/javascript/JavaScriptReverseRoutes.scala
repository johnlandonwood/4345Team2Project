// @GENERATOR:play-routes-compiler
// @SOURCE:/home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Sat Apr 30 14:35:59 CDT 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def addPublicationHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPublicationHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addPublication"})
        }
      """
    )
  
    // @LINE:10
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:8
    def loginHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:12
    def signupHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signupHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:17
    def myProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myProfile",
      """
        function(first_name0,last_name1,occupation2,bio3,phone4,email5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myprofile" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("first_name", first_name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("last_name", last_name1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("occupation", occupation2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bio", bio3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("phone", phone4), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email5)])})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
