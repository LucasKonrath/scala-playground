case class BankAccount(accountNumber: Int,
                       balance: Float,
                       accountType: String) {

  accountType match {
    case "Checking" => println("Checking account")
    case "Savings" => println("Savings account")
    case "Investment" => println("Investment account")
    case _ => println("Unknown account type")
  }

  def deposit(amount: Float): BankAccount = {
    this.copy(balance = this.balance + amount)
  }

  def withdraw(amount: Float): BankAccount = {
    this.copy(balance = this.balance - amount)
  }

}