class Manager(name: String, baseSalary: Double, bonus: Double) extends Employee(baseSalary) {

  override def calculateSalary(): Double = baseSalary + bonus
}
