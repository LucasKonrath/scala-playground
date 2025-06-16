object Test {
  def main(args: Array[String]): Unit = {
    val bankAccount = BankAccount(123456789, 1000.0f, "Checking").deposit(100.0f)
    bankAccount.withdraw(50.0f)
  }
}
