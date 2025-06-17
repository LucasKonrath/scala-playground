class Developer(name: String, baseSalary: Double,
                overtimeHours: Int, overtimeRate: Double) extends Employee(baseSalary) {

  override def calculateSalary(): Double = baseSalary + (overtimeHours * overtimeRate)
}
