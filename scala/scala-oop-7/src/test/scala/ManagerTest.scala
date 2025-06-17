class ManagerTest extends munit.FunSuite {
  test("Manager constructor parameters are stored correctly") {
    val name = "John"
    val baseSalary = 5000.0
    val bonus = 1000.0
    val manager = new Manager(name, baseSalary, bonus)

    assertEquals(manager.baseSalary, baseSalary)
  }

  test("Manager calculates salary as base salary plus bonus") {
    val baseSalary = 5000.0
    val bonus = 1000.0
    val manager = new Manager("John", baseSalary, bonus)

    assertEquals(manager.calculateSalary(), baseSalary + bonus)
  }

  test("Manager with zero bonus calculates salary correctly") {
    val baseSalary = 5000.0
    val bonus = 0.0
    val manager = new Manager("John", baseSalary, bonus)

    assertEquals(manager.calculateSalary(), baseSalary)
  }

  test("Manager with negative bonus calculates salary correctly") {
    val baseSalary = 5000.0
    val bonus = -500.0
    val manager = new Manager("John", baseSalary, bonus)

    assertEquals(manager.calculateSalary(), baseSalary + bonus)
  }
}
