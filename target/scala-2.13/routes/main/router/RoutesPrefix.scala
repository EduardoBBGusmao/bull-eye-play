// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/eduardogusmao/Documents/pbb/bull-eye-play/conf/routes
// @DATE:Mon Oct 05 09:07:17 BRT 2020


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
