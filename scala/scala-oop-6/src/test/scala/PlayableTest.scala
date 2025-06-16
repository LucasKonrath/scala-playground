import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayableTest extends AnyFlatSpec with Matchers {
  // Create a concrete class that uses the Playable trait
  class TestPlayable extends Playable

  "A Playable" should "play content" in {
    val playable = new TestPlayable()
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      playable.play()
    }
    output.toString should include ("playing")
  }
}
