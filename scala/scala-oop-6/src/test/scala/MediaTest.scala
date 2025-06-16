import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MediaTest extends AnyFlatSpec with Matchers {
  // Create a concrete subclass for testing the abstract Media class
  class TestMedia(title: String, author: String) extends Media(title, author)

  "A Media" should "store and provide access to title and author" in {
    val media = new TestMedia("Test Title", "Test Author")
    media.title should be ("Test Title")
    media.author should be ("Test Author")
  }

  it should "display information correctly" in {
    val media = new TestMedia("Test Title", "Test Author")
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      media.info()
    }
    output.toString should include ("Title: Test Title")
    output.toString should include ("Author: Test Author")
  }
}
