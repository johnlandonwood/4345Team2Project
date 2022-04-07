
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>USERNAME's myprofile</title>
    </head>
    <body>

        <nav class="navbar">
            <div class="container">
                <button type="button" class="btn" onclick="">Edit My Profile</button>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="col">
                    <h3>My Profile</h3>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h4 id="first_name">Landon</h4>
                </div>
                <div class="col">
                    <h4 id="last_name">Wood</h4>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h6 id="occupation">
                        Student at Southern Methodist University
                    </h6>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <p id="bio">
                        I'm a junior at SMU, majoring in Computer Science with a minor in Math.
                        In my studies, I'm primarily interested in game development (both programming and design),
                        software engineering, and leadership opportunities within STEM environments.
                        I'm a member of SMU's Game Development and Software Engineering clubs.
                        I'm a Dallas native and an alumnus of St. Mark's School of Texas.
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h5>Contact Info</h5>
                    <p>214-111-1111</p>
                    <p>landonw_at_smu.edu</p>
                </div>
            </div>
        </div>

        """),format.raw/*63.11*/("""

    """),format.raw/*65.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-01T18:31:47.294
                  SOURCE: /home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/myprofile.scala.html
                  HASH: 76602bce2fbb7aa9c7eb6bbfeb4d10abc9718728
                  MATRIX: 1032->0|2986->2158|3019->2164
                  LINES: 33->1|88->63|90->65
                  -- GENERATED --
              */
          