import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import java.io.{ByteArrayOutputStream, PrintStream}

class BadgerTest extends AnyFunSuite with Matchers {

  test("Badger should be able to walk") {
    val badger = new Badger()
    val outContent = new ByteArrayOutputStream()
    Console.withOut(outContent) {
      badger.walk()
    }
    outContent.toString().trim should be ("Walking")
  }

  test("Badger should be able to swim") {
    val badger = new Badger()
    val outContent = new ByteArrayOutputStream()
    Console.withOut(outContent) {
      badger.swim()
    }
    outContent.toString().trim should be ("Swimming")
  }

  test("Badger should not be able to fly") {
    val badger = new Badger()
    badger.isInstanceOf[Flyable] should be (false)
  }

  test("Badger should have all required capabilities") {
    val badger = new Badger()
    badger.isInstanceOf[Walkable] should be (true)
    badger.isInstanceOf[Swimmable] should be (true)
  }
}
