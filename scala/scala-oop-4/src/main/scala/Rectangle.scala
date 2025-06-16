class Rectangle(width: Float, height: Float) extends Shape {

  override def area(): Double = width * height

  override def perimeter(): Double = width * 2 + height * 2

}
