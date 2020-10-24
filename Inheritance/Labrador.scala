class Labrador(override val name: String, val color: String) extends Dog(name) {
  def getColor() : String = {
    return color
  }
  override def speak() : Unit = {
    println("WOOF")
  }
  val breedWeight = 75
  def avgBreedWeight() : Int = {
    return breedWeight
  }
}
