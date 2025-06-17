class DesignerTest extends munit.FunSuite {
  test("Designer constructor parameters are stored correctly") {
    val name = "Bob"
    val baseSalary = 4500.0
    val productivity = 1.2
    val designer = new Designer(name, baseSalary, productivity)

    assertEquals(designer.baseSalary, baseSalary)
  }

  test("Designer calculates salary as base salary multiplied by productivity") {
    val baseSalary = 4500.0
    val productivity = 1.2
    val designer = new Designer("Bob", baseSalary, productivity)

    assertEquals(designer.calculateSalary(), baseSalary * productivity)
  }

  test("Designer with productivity of 1.0 calculates salary equal to base salary") {
    val baseSalary = 4500.0
    val productivity = 1.0
    val designer = new Designer("Bob", baseSalary, productivity)

    assertEquals(designer.calculateSalary(), baseSalary)
  }

  test("Designer with productivity less than 1.0 calculates salary correctly") {
    val baseSalary = 4500.0
    val productivity = 0.8
    val designer = new Designer("Bob", baseSalary, productivity)

    assertEquals(designer.calculateSalary(), baseSalary * productivity)
  }

  test("Designer with zero productivity calculates salary of zero") {
    val baseSalary = 4500.0
    val productivity = 0.0
    val designer = new Designer("Bob", baseSalary, productivity)

    assertEquals(designer.calculateSalary(), 0.0)
  }
}
