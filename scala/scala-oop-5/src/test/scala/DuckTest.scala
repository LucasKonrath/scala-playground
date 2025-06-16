import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import java.io.{ByteArrayOutputStream, PrintStream}

class DuckTest extends AnyFunSuite with Matchers {

  test("Duck should be able to fly") {
    val duck = new Duck()
    val outContent = new ByteArrayOutputStream()
    Console.withOut(outContent) {
      duck.fly()
    }
    outContent.toString().trim should be ("Flying")
  }

  test("Duck should be able to swim") {
    val duck = new Duck()
    val outContent = new ByteArrayOutputStream()
    Console.withOut(outContent) {
      duck.swim()
    }
    outContent.toString().trim should be ("Swimming")
  }

  test("Duck should be able to walk") {
    val duck = new Duck()
    val outContent = new ByteArrayOutputStream()
    Console.withOut(outContent) {
      duck.walk()
    }
    outContent.toString().trim should be ("Walking")
  }

  test("Duck should have all required capabilities") {
    val duck = new Duck()
    duck.isInstanceOf[Flyable] should be (true)
    duck.isInstanceOf[Swimmable] should be (true)
    duck.isInstanceOf[Walkable] should be (true)
  }
}
