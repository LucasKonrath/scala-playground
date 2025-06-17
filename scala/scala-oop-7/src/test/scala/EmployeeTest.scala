class EmployeeTest extends munit.FunSuite {

  test("Employee is abstract") {
    val manager = new Manager("John", 5000.0, 1000.0)
    val developer = new Developer("Alice", 6000.0, 10, 50.0)
    val designer = new Designer("Bob", 4500.0, 1.2)

    assert(manager.isInstanceOf[Employee])
    assert(developer.isInstanceOf[Employee])
    assert(designer.isInstanceOf[Employee])
  }
}
