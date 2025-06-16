import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TriangleTest extends AnyFlatSpec with Matchers {

  "A Triangle" should "calculate area correctly" in {
    val triangle = new Triangle(3.0f, 4.0f, 5.0f)
    triangle.area() shouldBe (3.0 * 4.0 * 5.0 / 2) +- 0.001
  }

  it should "calculate perimeter correctly" in {
    val triangle = new Triangle(3.0f, 4.0f, 5.0f)
    triangle.perimeter() shouldBe 12.0 +- 0.001
  }

}
