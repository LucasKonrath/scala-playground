class Designer(name: String, baseSalary: Double, productivity: Double) extends Employee(baseSalary) {

                 override def calculateSalary(): Double = baseSalary * productivity
}
