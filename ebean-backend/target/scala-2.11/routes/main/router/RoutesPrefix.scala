
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Fri Apr 01 14:14:15 CDT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
