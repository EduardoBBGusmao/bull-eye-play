
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import models.Product

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(products: Seq[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
  """),format.raw/*5.3*/("""<div class="f">
    <header class="header">
      <a href="" class="logo">Bull Eye</a>
      <input class="menu-btn" type="checkbox" id="menu-btn" />
      <label class="menu-icon" for="menu-btn"><span class="navicon"></span></label>
      <ul class="menu">
        <li><a href="#about" class="color-a">Sobre</a></li>
        <li><a href="#products" class="color-a">Produtos</a></li>
        <li><a href="#fat" class="color-a">Histórico</a></li>
        <li><a href="#contact" class="color-a">Contato</a></li>
      </ul>
    </header>
    <div class="bg-1" id="about">
      <div class="container about">
        <div class="row">
          <div class="col-sm test">
            <img src=""""),_display_(/*21.24*/routes/*21.30*/.Assets.versioned("images/bull-512.png")),format.raw/*21.70*/("""" height="400" class="mob-img" />
          </div>
          <div class="col-sm">
            <h1>Bullseye</h1>
            Visualize todos investimentos de maneira rápida e em apenas um App.
            Com o Bull Eye você pode ver como andam as suas ações, criptomoedas 
            e outros tipos de investimentos.
          </div>
        </div>
      </div>
    </div>
    <div class="bg-2" id="products">
      <div class="container about">
        <div class="col">
          <h1>Funcionalidades</h1>
          <div class="container ov-scroll">
            <div class="row">
              """),_display_(/*38.16*/for( i <- 0 to (products.length - 1)) yield /*38.53*/ {_display_(Seq[Any](format.raw/*38.55*/("""
                """),format.raw/*39.17*/("""<div class="col-sm">
                    <div class="row-sm">
                      <img src=""""),_display_(/*41.34*/routes/*41.40*/.Assets.versioned(products(i).url)),format.raw/*41.74*/("""" height="200"/>
                    </div>
                    <div class="row-sm">
                      <h4>"""),_display_(/*44.28*/products(i)/*44.39*/.name),format.raw/*44.44*/("""</h4>
                    </div>
                    <div class="row-sm text-box">
                      """),_display_(/*47.24*/products(i)/*47.35*/.description),format.raw/*47.47*/("""
                    """),format.raw/*48.21*/("""</div>
                  </div>
              """)))}),format.raw/*50.16*/("""
            """),format.raw/*51.13*/("""</div>
          </div>
        </div>
      </div>
    </div>
    <div class="bg-3" id="fat">
      <div class="container about">
        <div class="col">
          <div class="row title-black">
            <h1>Histórico</h1>
          </div>
          <div class="row">
            <canvas id="myChart" width="1600" height="900"></canvas>
          </div>
        </div>
      </div>
    </div>
    <div class="bg-4" id="products">
      <div class="container about">
        <div class="row footer" >
          <div class="col text-box">
            <h3>Contato</h3>
          </div>
          <div class="col ">
            <div>(81) 91234-5678</div>
            <div>contato@bulls.eye</div>
          </div>
        </div>
      </div>
    </div>
  </div>
  
""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(products:Seq[Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((Seq[Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-05T13:19:51.633388
                  SOURCE: /Users/eduardogusmao/Documents/pbb/bull-eye-play/app/views/index.scala.html
                  HASH: a3bd19044f3dcf3a03ac897f93ef2830eae74c5f
                  MATRIX: 610->1|942->24|1060->49|1087->51|1118->74|1157->76|1186->79|1904->770|1919->776|1980->816|2604->1413|2657->1450|2697->1452|2742->1469|2864->1564|2879->1570|2934->1604|3073->1716|3093->1727|3119->1732|3252->1838|3272->1849|3305->1861|3354->1882|3432->1929|3473->1942|4269->2709
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|35->5|51->21|51->21|51->21|68->38|68->38|68->38|69->39|71->41|71->41|71->41|74->44|74->44|74->44|77->47|77->47|77->47|78->48|80->50|81->51|113->83
                  -- GENERATED --
              */
          