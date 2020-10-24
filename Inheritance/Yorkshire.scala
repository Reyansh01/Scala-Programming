class Yorkshire(override val name: String, val color: String) extends Dog(name) {

  def getColor() : String = {
    return color
  }
  override def speak() : Unit = {
    println("woof")
  }
}
