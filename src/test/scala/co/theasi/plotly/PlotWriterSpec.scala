package co.theasi.plotly

import org.scalatest._

class PlotWriterSpec extends FlatSpec with Matchers {

  implicit val testSession = new Session {
    val credentials = Credentials("PlotlyImageTest", "786r5mecv0")
    val plotlyUrl = "https://plot.ly/clientresp"
  }

  "plot" should "send a plot request to Plotly" in {
    plot(
      Vector(1.0, 2.0, 3.0), Vector(1.0, 5.0, 10.0),
      "hello-scala")(testSession)
  }

}
