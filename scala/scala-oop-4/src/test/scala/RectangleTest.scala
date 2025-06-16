import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RectangleTest extends AnyFlatSpec with Matchers {

  "A Rectangle" should "calculate area correctly" in {
    val rectangle = new Rectangle(5.0f, 4.0f)
    rectangle.area() shouldBe 20.0 +- 0.001
  }

  it should "calculate perimeter correctly" in {
    val rectangle = new Rectangle(5.0f, 4.0f)
    rectangle.perimeter() shouldBe 18.0 +- 0.001
  }

}
