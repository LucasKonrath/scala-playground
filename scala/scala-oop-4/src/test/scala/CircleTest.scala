import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CircleTest extends AnyFlatSpec with Matchers {

  "A Circle" should "calculate area correctly" in {
    val circle = new Circle(10.0f)
    circle.area() shouldBe (10.0 * 10.0 * Math.PI / 360) +- 0.001
  }

  it should "calculate perimeter correctly" in {
    val circle = new Circle(10.0f)
    circle.perimeter() shouldBe (10.0 * 2 * Math.PI) +- 0.001
  }

}
