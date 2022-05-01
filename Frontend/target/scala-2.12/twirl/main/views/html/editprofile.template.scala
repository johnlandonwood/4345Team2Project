
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object editprofile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(first_name: String, last_name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>

"""),format.raw/*19.15*/("""
"""),format.raw/*20.99*/("""
"""),format.raw/*21.34*/("""
"""),format.raw/*22.54*/("""
"""),format.raw/*23.95*/("""
"""),format.raw/*24.67*/("""
"""),format.raw/*25.27*/("""
"""),format.raw/*26.23*/("""
"""),format.raw/*27.34*/("""
"""),format.raw/*28.54*/("""
"""),format.raw/*29.81*/("""
"""),format.raw/*30.65*/("""
"""),format.raw/*31.27*/("""
"""),format.raw/*32.23*/("""
"""),format.raw/*33.34*/("""
"""),format.raw/*34.110*/("""
"""),format.raw/*35.23*/("""
"""),format.raw/*36.20*/("""
"""),format.raw/*37.16*/("""
"""),format.raw/*38.1*/("""</html>"""))
      }
    }
  }

  def render(first_name:String,last_name:String): play.twirl.api.HtmlFormat.Appendable = apply(first_name,last_name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (first_name,last_name) => apply(first_name,last_name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-05-01T15:16:33.646
                  SOURCE: /home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/editprofile.scala.html
                  HASH: 795896e9797d8ce55f5e62293dd536e48340f4e6
                  MATRIX: 961->1|1094->41|2323->1258|2352->1357|2381->1391|2410->1445|2439->1540|2468->1607|2497->1634|2526->1657|2555->1691|2584->1745|2613->1826|2642->1891|2671->1918|2700->1941|2729->1975|2759->2085|2788->2108|2817->2128|2846->2144|2874->2145
                  LINES: 28->1|33->2|50->19|51->20|52->21|53->22|54->23|55->24|56->25|57->26|58->27|59->28|60->29|61->30|62->31|63->32|64->33|65->34|66->35|67->36|68->37|69->38
                  -- GENERATED --
              */
          