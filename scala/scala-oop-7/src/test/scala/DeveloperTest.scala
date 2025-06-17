class DeveloperTest extends munit.FunSuite {
  test("Developer constructor parameters are stored correctly") {
    val name = "Alice"
    val baseSalary = 6000.0
    val overtimeHours = 10
    val overtimeRate = 50.0
    val developer = new Developer(name, baseSalary, overtimeHours, overtimeRate)

    assertEquals(developer.baseSalary, baseSalary)
  }

  test("Developer calculates salary as base salary plus overtime compensation") {
    val baseSalary = 6000.0
    val overtimeHours = 10
    val overtimeRate = 50.0
    val developer = new Developer("Alice", baseSalary, overtimeHours, overtimeRate)

    assertEquals(developer.calculateSalary(), baseSalary + (overtimeHours * overtimeRate))
  }

  test("Developer with zero overtime hours calculates salary correctly") {
    val baseSalary = 6000.0
    val overtimeHours = 0
    val overtimeRate = 50.0
    val developer = new Developer("Alice", baseSalary, overtimeHours, overtimeRate)

    assertEquals(developer.calculateSalary(), baseSalary)
  }

  test("Developer with zero overtime rate calculates salary correctly") {
    val baseSalary = 6000.0
    val overtimeHours = 10
    val overtimeRate = 0.0
    val developer = new Developer("Alice", baseSalary, overtimeHours, overtimeRate)

    assertEquals(developer.calculateSalary(), baseSalary)
  }
}
