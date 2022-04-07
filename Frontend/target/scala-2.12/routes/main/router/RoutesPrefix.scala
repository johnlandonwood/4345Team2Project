// @GENERATOR:play-routes-compiler
// @SOURCE:/home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Wed Apr 06 18:13:33 CDT 2022


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
