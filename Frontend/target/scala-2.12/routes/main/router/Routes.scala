// @GENERATOR:play-routes-compiler
// @SOURCE:/home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Sat Apr 30 14:35:59 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:15
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:15
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.signupHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myprofile""", """controllers.HomeController.myProfile(first_name:String, last_name:String, occupation:String, bio:String, phone:String, email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPublication""", """controllers.HomeController.addPublicationHandler()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_loginHandler1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginHandler1_invoker = createInvoker(
    HomeController_1.loginHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginHandler",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_signup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup2_invoker = createInvoker(
    HomeController_1.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_signupHandler3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_signupHandler3_invoker = createInvoker(
    HomeController_1.signupHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signupHandler",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_myProfile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myprofile")))
  )
  private[this] lazy val controllers_HomeController_myProfile5_invoker = createInvoker(
    HomeController_1.myProfile(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myProfile",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """myprofile""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_addPublicationHandler6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPublication")))
  )
  private[this] lazy val controllers_HomeController_addPublicationHandler6_invoker = createInvoker(
    HomeController_1.addPublicationHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPublicationHandler",
      Nil,
      "GET",
      this.prefix + """addPublication""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:8
    case controllers_HomeController_loginHandler1_route(params@_) =>
      call { 
        controllers_HomeController_loginHandler1_invoker.call(HomeController_1.loginHandler())
      }
  
    // @LINE:10
    case controllers_HomeController_signup2_route(params@_) =>
      call { 
        controllers_HomeController_signup2_invoker.call(HomeController_1.signup())
      }
  
    // @LINE:12
    case controllers_HomeController_signupHandler3_route(params@_) =>
      call { 
        controllers_HomeController_signupHandler3_invoker.call(HomeController_1.signupHandler())
      }
  
    // @LINE:15
    case controllers_Assets_at4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:17
    case controllers_HomeController_myProfile5_route(params@_) =>
      call(params.fromQuery[String]("first_name", None), params.fromQuery[String]("last_name", None), params.fromQuery[String]("occupation", None), params.fromQuery[String]("bio", None), params.fromQuery[String]("phone", None), params.fromQuery[String]("email", None)) { (first_name, last_name, occupation, bio, phone, email) =>
        controllers_HomeController_myProfile5_invoker.call(HomeController_1.myProfile(first_name, last_name, occupation, bio, phone, email))
      }
  
    // @LINE:19
    case controllers_HomeController_addPublicationHandler6_route(params@_) =>
      call { 
        controllers_HomeController_addPublicationHandler6_invoker.call(HomeController_1.addPublicationHandler())
      }
  }
}
