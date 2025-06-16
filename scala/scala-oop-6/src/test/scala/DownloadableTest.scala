import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DownloadableTest extends AnyFlatSpec with Matchers {
  // Create a concrete class that uses the Downloadable trait
  class TestDownloadable extends Downloadable

  "A Downloadable" should "download content" in {
    val downloadable = new TestDownloadable()
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      downloadable.download()
    }
    output.toString should include ("downloading")
  }
}
