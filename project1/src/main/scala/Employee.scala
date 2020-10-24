class Employee(override val emp_name : String, var ann_sal : Double, var yoj : Int, var nat_ins_num : String) extends Person(emp_name)
{
  println(s"$emp_name We are very happy to say that you are our member from $yoj .")
  println(s"Your annual package is of $ann_sal and your national insurance number is : $nat_ins_num")
}

object Employee
{
  def main(args : Array[String]) : Unit = {
    var emp1 = new Employee("Reyansh", 1000000, 2018, "N1772218095")
    var empp = emp1
    var emp3 = new Employee("Harsh", 50000, 2014, "N17722343")
    var emp4 = new Employee("Yash", 60000, 2011, "R17348095")
    println()
    if(emp1.equals(empp))
    {
      println("You have given same input as the object values are same...")
    }
    else
    {
      println("These objects are different...")
    }
    if(emp3.equals(emp4))
    {
      println("These object values are same...")
    }
    else {
      println("These objects are different...")
    }
  }
}