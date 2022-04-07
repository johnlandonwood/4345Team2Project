
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

object myprofile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(first_name: String, last_name: String, occupation: String, bio: String, phone: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
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
"""),format.raw/*18.102*/("""
    """),format.raw/*19.5*/("""</head>

    <body>

        <nav class="navbar">
            <div class="container">
                <button type="button" class="btn">Edit My Profile</button>
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
                    <h4 id="first_name">"""),_display_(/*37.42*/first_name),format.raw/*37.52*/("""</h4>
                </div>
                <div class="col">
                    <h4 id="last_name">"""),_display_(/*40.41*/last_name),format.raw/*40.50*/("""</h4>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h6 id="occupation">
                        """),_display_(/*46.26*/occupation),format.raw/*46.36*/("""
                    """),format.raw/*47.21*/("""</h6>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <p id="bio">
                        """),_display_(/*53.26*/bio),format.raw/*53.29*/("""
                    """),format.raw/*54.21*/("""</p>
                </div>
            </div>

"""),format.raw/*58.34*/("""
"""),format.raw/*59.38*/("""
"""),format.raw/*60.43*/("""
"""),format.raw/*61.29*/("""
"""),format.raw/*62.33*/("""
"""),format.raw/*63.34*/("""
"""),format.raw/*64.30*/("""
"""),format.raw/*65.27*/("""
"""),format.raw/*66.23*/("""
"""),format.raw/*67.58*/("""

            """),format.raw/*69.13*/("""<div class="row">
                <div class="col">
                    <h5><u>Contact Info</u></h5>
                    <p>"""),_display_(/*72.25*/phone),format.raw/*72.30*/("""</p>
                    <p>"""),_display_(/*73.25*/email),format.raw/*73.30*/("""</p>
                </div>
            </div>

            <div class="row">
                <div class="col">
                    <h5><u>"""),_display_(/*79.29*/first_name),format.raw/*79.39*/("""'s Research History/Publications</u></h5>
                    <table id="research_history">
                        <thead>
                            <tr>
                                <th>Title</th>
                                <th>Media Type</th>
                                <th>Date</th>
                                <th>Link</th>
                            </tr>
                        </thead>
                    </table>

                    <button id="addResearchButton" type="button" class="btn" onclick=addResearch()>Test add</button>

"""),format.raw/*93.66*/("""
"""),format.raw/*94.56*/("""
"""),format.raw/*95.53*/("""
"""),format.raw/*96.100*/("""
"""),format.raw/*97.31*/("""

                    """),format.raw/*99.21*/("""<button id="modal-btn" type="button" class="btn"> Add Research History/Publication</button>

                    <div class="modal">
                        <div class="modal-content" style="">
                            <span class="close-btn">&times;</span>
                            <p>Enter the new research history/publication information:</p>
                            <form id="addNewResearchForm">
                                <div class="container">
                                    <label for="title">Title</label>
                                    <input type="text" id="title" name="title" placeholder="test"/>
                                    <label for="mediaType">Media Type</label>
                                    <input type="text" id="mediaType" name="mediaType" placeholder="test"/>
                                    <label for="date">Date Published</label>
                                    <input type="date" id="date" name="date" placeholder="test"/>
                                    <label for="link">Link to content</label>
                                    <input type="text" id="link" name="link" placeholder="test"/>
                                </div>

                            </form>

                        </div>
                    </div>





                </div>
            </div>

        </div>

        <script>
            function addResearch() """),format.raw/*132.36*/("""{"""),format.raw/*132.37*/("""
                """),format.raw/*133.17*/("""let table = document.getElementById("research_history");
                let row = table.insertRow();
                let title = row.insertCell(0);
                let mediaType = row.insertCell(1);
                let date = row.insertCell(2);
                let link = row.insertCell(3);
                title.innerHTML = "Test Title";
                mediaType.innerHTML = "Article";
                date.innerHTML = "01-01-2020";
                link.innerHTML = "<a href=google.com>Link</a>"
            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/("""
        """),format.raw/*144.9*/("""</script>

        <script>
                let modalBtn = document.getElementById("modal-btn")
                let modal = document.querySelector(".modal")
                let closeBtn = document.querySelector(".close-btn")
                modalBtn.onclick = function()"""),format.raw/*150.46*/("""{"""),format.raw/*150.47*/("""
                    """),format.raw/*151.21*/("""modal.style.display = "block"
                """),format.raw/*152.17*/("""}"""),format.raw/*152.18*/("""
                """),format.raw/*153.17*/("""closeBtn.onclick = function()"""),format.raw/*153.46*/("""{"""),format.raw/*153.47*/("""
                    """),format.raw/*154.21*/("""modal.style.display = "none"
                """),format.raw/*155.17*/("""}"""),format.raw/*155.18*/("""
                """),format.raw/*156.17*/("""// window.onclick = function(e)"""),format.raw/*156.48*/("""{"""),format.raw/*156.49*/("""
                """),format.raw/*157.17*/("""//     if(e.target === modal)"""),format.raw/*157.46*/("""{"""),format.raw/*157.47*/("""
                """),format.raw/*158.17*/("""//         modal.style.display = "none"
                //     """),format.raw/*159.24*/("""}"""),format.raw/*159.25*/("""
                """),format.raw/*160.17*/("""// """),format.raw/*160.20*/("""}"""),format.raw/*160.21*/("""
        """),format.raw/*161.9*/("""</script>



"""),format.raw/*165.21*/("""
"""),format.raw/*166.73*/("""
"""),format.raw/*167.72*/("""
"""),format.raw/*168.68*/("""
"""),format.raw/*169.43*/("""
"""),format.raw/*170.51*/("""
"""),format.raw/*171.18*/("""
"""),format.raw/*172.44*/("""
"""),format.raw/*173.50*/("""
"""),format.raw/*174.18*/("""
"""),format.raw/*175.22*/("""



        """),format.raw/*186.11*/("""

    """),format.raw/*188.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(first_name:String,last_name:String,occupation:String,bio:String,phone:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(first_name,last_name,occupation,bio,phone,email)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (first_name,last_name,occupation,bio,phone,email) => apply(first_name,last_name,occupation,bio,phone,email)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-07T14:22:56.863
                  SOURCE: /home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/myprofile.scala.html
                  HASH: 89a82f04d6f6b8b3fffe24d1eed887fe430302c3
                  MATRIX: 987->1|1183->104|1210->105|2427->1396|2459->1401|2965->1880|2996->1890|3126->1993|3156->2002|3361->2180|3392->2190|3441->2211|3638->2381|3662->2384|3711->2405|3787->2486|3816->2524|3845->2567|3874->2596|3903->2629|3932->2663|3961->2693|3990->2720|4019->2743|4048->2801|4090->2815|4242->2940|4268->2945|4324->2974|4350->2979|4517->3119|4548->3129|5139->3757|5168->3813|5197->3866|5227->3966|5256->3997|5306->4019|6759->5443|6789->5444|6835->5461|7375->5972|7405->5973|7442->5982|7741->6252|7771->6253|7821->6274|7896->6320|7926->6321|7972->6338|8030->6367|8060->6368|8110->6389|8184->6434|8214->6435|8260->6452|8320->6483|8350->6484|8396->6501|8454->6530|8484->6531|8530->6548|8622->6611|8652->6612|8698->6629|8730->6632|8760->6633|8797->6642|8839->6675|8869->6748|8899->6820|8929->6888|8959->6931|8989->6982|9019->7000|9049->7044|9079->7094|9109->7112|9139->7134|9180->7378|9214->7384
                  LINES: 28->1|33->2|34->3|49->18|50->19|68->37|68->37|71->40|71->40|77->46|77->46|78->47|84->53|84->53|85->54|89->58|90->59|91->60|92->61|93->62|94->63|95->64|96->65|97->66|98->67|100->69|103->72|103->72|104->73|104->73|110->79|110->79|124->93|125->94|126->95|127->96|128->97|130->99|163->132|163->132|164->133|174->143|174->143|175->144|181->150|181->150|182->151|183->152|183->152|184->153|184->153|184->153|185->154|186->155|186->155|187->156|187->156|187->156|188->157|188->157|188->157|189->158|190->159|190->159|191->160|191->160|191->160|192->161|196->165|197->166|198->167|199->168|200->169|201->170|202->171|203->172|204->173|205->174|206->175|210->186|212->188
                  -- GENERATED --
              */
          