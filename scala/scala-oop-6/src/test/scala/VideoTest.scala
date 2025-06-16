import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class VideoTest extends AnyFlatSpec with Matchers {
  "A Video" should "inherit properties from Media" in {
    val video = new Video("Video Title", "Video Creator", 600)
    video.title should be ("Video Title")
    video.author should be ("Video Creator")
  }

  it should "store duration correctly" in {
    val video = new Video("Video Title", "Video Creator", 600)
    video.duration should be (600)
  }

  it should "implement the Downloadable trait" in {
    val video = new Video("Video Title", "Video Creator", 600)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      video.download()
    }
    output.toString should include ("downloading")
  }

  it should "display information correctly" in {
    val video = new Video("Video Title", "Video Creator", 600)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      video.info()
    }
    output.toString should include ("Title: Video Title")
    output.toString should include ("Author: Video Creator")
  }
}
