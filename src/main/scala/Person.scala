case class Person(name: String, age: Int, email: String) {
  def introduce() : Unit = {
    println(s"Hi, my name is $name and I am $age years old.")
  }
}
