// @GENERATOR:play-routes-compiler
// @SOURCE:/home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Sat Apr 30 14:35:59 CDT 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def addPublicationHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addPublication")
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:8
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:12
    def signupHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:17
    def myProfile(first_name:String, last_name:String, occupation:String, bio:String, phone:String, email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myprofile" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("first_name", first_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("last_name", last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("occupation", occupation)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bio", bio)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("phone", phone)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
