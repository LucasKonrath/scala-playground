class Circle(val diameter: Float) extends Shape {

  override def area(): Double = diameter * diameter * Math.PI / 360

  override def perimeter(): Double = diameter * 2 * Math.PI
}
