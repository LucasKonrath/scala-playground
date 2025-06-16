class Triangle(a: Float, b: Float, c:Float) extends Shape {

  override def area(): Double = a * b * c / 2

  override def perimeter(): Double = a + b + c
}
