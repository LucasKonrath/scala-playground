import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShapeTest extends AnyFlatSpec with Matchers {

  "A Shape" should "be implemented by concrete classes" in {
    val rectangle = new Rectangle(5.0f, 4.0f)
    val circle = new Circle(10.0f)
    val triangle = new Triangle(3.0f, 4.0f, 5.0f)

    rectangle shouldBe a [Shape]
    circle shouldBe a [Shape]
    triangle shouldBe a [Shape]
  }

  it should "provide area calculation for all shapes" in {
    val shapes = List(
      new Rectangle(5.0f, 4.0f),
      new Circle(10.0f),
      new Triangle(3.0f, 4.0f, 5.0f)
    )

    // All shapes should have a non-negative area
    for (shape <- shapes) {
      shape.area() should be >= 0.0
    }
  }

  it should "provide perimeter calculation for all shapes" in {
    val shapes = List(
      new Rectangle(5.0f, 4.0f),
      new Circle(10.0f),
      new Triangle(3.0f, 4.0f, 5.0f)
    )

    for (shape <- shapes) {
      shape.perimeter() should be >= 0.0
    }
  }
}
