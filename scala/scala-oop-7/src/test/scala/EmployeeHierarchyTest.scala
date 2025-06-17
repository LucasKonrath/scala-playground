class EmployeeHierarchyTest extends munit.FunSuite {
  test("Different employee types calculate salaries correctly") {
    val manager = new Manager("John", 5000.0, 1000.0)
    val developer = new Developer("Alice", 6000.0, 10, 50.0)
    val designer = new Designer("Bob", 4500.0, 1.2)

    assertEquals(manager.calculateSalary(), 6000.0)
    assertEquals(developer.calculateSalary(), 6500.0)
    assertEquals(designer.calculateSalary(), 5400.0)
  }

  test("Employees can be stored in an Employee list") {
    val employees = List[
      Employee](
      new Manager("John", 5000.0, 1000.0),
      new Developer("Alice", 6000.0, 10, 50.0),
      new Designer("Bob", 4500.0, 1.2)
    )

    val totalSalary = employees.map(_.calculateSalary()).sum
    assertEquals(totalSalary, 6000.0 + 6500.0 + 5400.0)
  }
}
