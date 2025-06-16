import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PodcastTest extends AnyFlatSpec with Matchers {
  "A Podcast" should "inherit properties from Media" in {
    val podcast = new Podcast("Podcast Title", "Podcast Host", 3600)
    podcast.title should be ("Podcast Title")
    podcast.author should be ("Podcast Host")
  }

  it should "store duration correctly" in {
    val podcast = new Podcast("Podcast Title", "Podcast Host", 3600)
    podcast.duration should be (3600)
  }

  it should "implement the Playable trait" in {
    val podcast = new Podcast("Podcast Title", "Podcast Host", 3600)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      podcast.play()
    }
    output.toString should include ("playing")
  }

  it should "implement the Downloadable trait" in {
    val podcast = new Podcast("Podcast Title", "Podcast Host", 3600)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      podcast.download()
    }
    output.toString should include ("downloading")
  }

  it should "display information correctly" in {
    val podcast = new Podcast("Podcast Title", "Podcast Host", 3600)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      podcast.info()
    }
    output.toString should include ("Title: Podcast Title")
    output.toString should include ("Author: Podcast Host")
  }
}
