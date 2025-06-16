import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SongTest extends AnyFlatSpec with Matchers {
  "A Song" should "inherit properties from Media" in {
    val song = new Song("Song Title", "Song Artist", 180)
    song.title should be ("Song Title")
    song.author should be ("Song Artist")
  }

  it should "store duration correctly" in {
    val song = new Song("Song Title", "Song Artist", 180)
    song.duration should be (180)
  }

  it should "implement the Playable trait" in {
    val song = new Song("Song Title", "Song Artist", 180)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      song.play()
    }
    output.toString should include ("playing")
  }

  it should "display information correctly" in {
    val song = new Song("Song Title", "Song Artist", 180)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      song.info()
    }
    output.toString should include ("Title: Song Title")
    output.toString should include ("Author: Song Artist")
  }
}
