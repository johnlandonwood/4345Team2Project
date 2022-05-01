
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
                    <h4 id="first_name">"""),_display_(/*36.42*/first_name),format.raw/*36.52*/("""</h4>
                </div>
                <div class="col">
                    <h4 id="last_name">"""),_display_(/*39.41*/last_name),format.raw/*39.50*/("""</h4>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h6 id="occupation">
                        """),_display_(/*45.26*/occupation),format.raw/*45.36*/("""
                    """),format.raw/*46.21*/("""</h6>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <p id="bio">
                        """),_display_(/*52.26*/bio),format.raw/*52.29*/("""
                    """),format.raw/*53.21*/("""</p>
                </div>
            </div>

            <div class="row">
                <div class="col">
                    <h5><u>Contact Info</u></h5>
                    <p>"""),_display_(/*60.25*/phone),format.raw/*60.30*/("""</p>
                    <p>"""),_display_(/*61.25*/email),format.raw/*61.30*/("""</p>
                </div>
            </div>



            <div class="row">
                <div class="col">
                    <h5><u>"""),_display_(/*69.29*/first_name),format.raw/*69.39*/("""'s Publications</u></h5>
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


                    <button id="addResearchButton" type="button" class="btn" onclick=testAddResearch()>Test add</button>
                    <button id="modal-btn" type="button" class="btn"> Add Publication</button>
                    <div class="modal">
                        <div class="modal-content" style="">
                            <span class="close-btn">&times;</span>
                            <p>Enter the new publication's information:</p>
                            <form action=""""),_display_(/*88.44*/routes/*88.50*/.HomeController.addPublicationHandler()),format.raw/*88.89*/("""" method="GET" id="addNewResearchForm" >
                                <div class="container">
                                    <label for="title">Title</label>
                                    <input type="text" id="title" name="title" placeholder="Enter title..."/>
                                    <label for="media_type">Media Type</label>
                                    <input type="text" id="media_type" name="media_type" placeholder="Enter the type of media (article, video, etc.)"/>
                                    <label for="date">Date Published</label>
                                    <input type="date" id="date" name="date" placeholder="Date published..."/>
                                    <label for="link">Link to content</label>
                                    <input type="text" id="link" name="link" placeholder="Link to content..."/>
                                    <input type="submit" value="Submit" id="submit-form-btn" class="btn" onclick="addPublicationFrontend()">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>


        <script>
            function addPublicationFrontend() """),format.raw/*110.47*/("""{"""),format.raw/*110.48*/("""
                """),format.raw/*111.17*/("""let table = document.getElementById("research_history");
                let row = table.insertRow();
                let title = row.insertCell(0);
                let media_type = row.insertCell(1);
                let date = row.insertCell(2);
                let link = row.insertCell(3);
                title.innerHTML = document.getElementById('title').value;
                media_type.innerHTML = document.getElementById('media_type').value;
                date.innerHTML = document.getElementById('date').value;
                link.innerHTML = "<a href=document.getElementById('link').value>Link</a>"
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/("""
        """),format.raw/*122.9*/("""</script>

        <script>
            function testAddResearch() """),format.raw/*125.40*/("""{"""),format.raw/*125.41*/("""
                """),format.raw/*126.17*/("""let table = document.getElementById("research_history");
                let row = table.insertRow();
                let title = row.insertCell(0);
                let media_type = row.insertCell(1);
                let date = row.insertCell(2);
                let link = row.insertCell(3);
                title.innerHTML = "Test Title";
                media_type.innerHTML = "Article";
                date.innerHTML = "01-01-2020";
                link.innerHTML = "<a href=google.com>Link</a>"
            """),format.raw/*136.13*/("""}"""),format.raw/*136.14*/("""
        """),format.raw/*137.9*/("""</script>



        """),format.raw/*141.33*/("""
        """),format.raw/*142.9*/("""<script>
                let modalBtn = document.getElementById("modal-btn")
                let modal = document.querySelector(".modal")
                let closeBtn = document.querySelector(".close-btn")
                modalBtn.onclick = function()"""),format.raw/*146.46*/("""{"""),format.raw/*146.47*/("""
                    """),format.raw/*147.21*/("""modal.style.display = "block"
                """),format.raw/*148.17*/("""}"""),format.raw/*148.18*/("""
                """),format.raw/*149.17*/("""closeBtn.onclick = function()"""),format.raw/*149.46*/("""{"""),format.raw/*149.47*/("""
                    """),format.raw/*150.21*/("""modal.style.display = "none"
                """),format.raw/*151.17*/("""}"""),format.raw/*151.18*/("""
                """),format.raw/*152.17*/("""// window.onclick = function(e)"""),format.raw/*152.48*/("""{"""),format.raw/*152.49*/("""
                """),format.raw/*153.17*/("""//     if(e.target == modal)"""),format.raw/*153.45*/("""{"""),format.raw/*153.46*/("""
                """),format.raw/*154.17*/("""//         modal.style.display = "none"
                //     """),format.raw/*155.24*/("""}"""),format.raw/*155.25*/("""
                """),format.raw/*156.17*/("""// """),format.raw/*156.20*/("""}"""),format.raw/*156.21*/("""
        """),format.raw/*157.9*/("""</script>



    </body>
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
                  DATE: 2022-04-30T14:35:59.846
                  SOURCE: /home/landon/classes/CS4345/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/myprofile.scala.html
                  HASH: de81415635147772df6cfdbe37e7e92b456c2d48
                  MATRIX: 987->1|1183->104|1210->105|2427->1396|2459->1401|2890->1805|2921->1815|3051->1918|3081->1927|3286->2105|3317->2115|3366->2136|3563->2306|3587->2309|3636->2330|3848->2515|3874->2520|3930->2549|3956->2554|4125->2696|4156->2706|5115->3638|5130->3644|5190->3683|6501->4965|6531->4966|6577->4983|7231->5608|7261->5609|7298->5618|7394->5685|7424->5686|7470->5703|8012->6216|8042->6217|8079->6226|8129->6271|8166->6280|8446->6531|8476->6532|8526->6553|8601->6599|8631->6600|8677->6617|8735->6646|8765->6647|8815->6668|8889->6713|8919->6714|8965->6731|9025->6762|9055->6763|9101->6780|9158->6808|9188->6809|9234->6826|9326->6889|9356->6890|9402->6907|9434->6910|9464->6911|9501->6920
                  LINES: 28->1|33->2|34->3|49->18|50->19|67->36|67->36|70->39|70->39|76->45|76->45|77->46|83->52|83->52|84->53|91->60|91->60|92->61|92->61|100->69|100->69|119->88|119->88|119->88|141->110|141->110|142->111|152->121|152->121|153->122|156->125|156->125|157->126|167->136|167->136|168->137|172->141|173->142|177->146|177->146|178->147|179->148|179->148|180->149|180->149|180->149|181->150|182->151|182->151|183->152|183->152|183->152|184->153|184->153|184->153|185->154|186->155|186->155|187->156|187->156|187->156|188->157
                  -- GENERATED --
              */
          