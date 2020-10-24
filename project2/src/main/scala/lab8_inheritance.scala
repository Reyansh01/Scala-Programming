
class Account(val name : String,val acc_num : Int, val bal : Int) {
  def showDetails(): Any = {
    println("Hello " + name)
    println("Your account number is : " + acc_num)
    println("Your Balance is : " + bal)
  }
}

class SavingsAccount(override val name : String, override val acc_num : Int, override val bal : Int) extends Account(name : String, acc_num : Int, bal : Int)
{
  val interest : Double = 4.5
  def interest_cal() : Any = {
    val interest_rate = (interest * bal)/100
    val new_bal = bal + interest_rate
    println(s"$name Your account balance in Savings account after interest is : $new_bal")
  }
}

class CurrentAccount(override val name : String, override val acc_num : Int, override val bal : Int) extends Account(name : String, acc_num : Int, bal : Int)
{
  var confirm : Int = 0
  def calc_over(withdrawl : Int) : Any = {
    val over_value : Int = 10000
    if(over_value <= withdrawl)
      {
        confirm = 0
      }
    else
      {
        confirm = 1
      }
  }
  override def showDetails() : Any =
  {
    if(confirm == 0)
      {
        println(s"Sorry $name but the amount you asked for has exceeded the overdraft.")
      }
    else
      {
        println(s"Hello $name, your account number is $acc_num and your current balance is : $bal and you can withdraw the money.")
      }
  }
}

class Bank(override val name : String, override val acc_num : Int, override val bal : Int) extends Account(name : String, acc_num : Int, bal : Int)
{
  def open_account() : Any = {
    println(s"Your account has been created $name with an account number : $acc_num. We hope to serve you better day-by-day.")
  }
  def close_account() : Any = {
    println(s"Thank you for using our services $name.")
  }
  def dividend() : Any = {
    val divi : Double = (1.5*bal)/100
    val divi_bal : Double = bal + divi
    println(s"$name After addition of dividend your balance is : $divi_bal")
  }
  def Update() : Any = {
    val lim = new CurrentAccount("Reyansh",1771712,10000)
    val withd = 50000
    print(s"Amount to withdrawl is : $withd ")
    lim.calc_over(withd)
    lim.showDetails()
    val withd2 = 1000
    print(s"Amount to withdrawl is : $withd2 ")
    lim.calc_over(withd2)
    lim.showDetails()
    val sa = new SavingsAccount("Reyansh",1771712,10000)
    sa.interest_cal()
    dividend()
    close_account()
  }
}
object lab8_inheritance {
 def main(args : Array[String]) : Unit = {
   val ac = new Account("Reyansh",1771712,10000)
   val bk = new Bank("Reyansh",1771712,10000)
   bk.open_account()
   ac.showDetails()
   val values = new Array[Account](2)
   bk.Update()
 }
}