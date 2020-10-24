object DogTest
{
  def main(args : Array[String]) : Unit = {
    println("NAME - REYANSH MISHRA")
    println("ROLL NUMBER - 95")
    println("**DOG**")
    val dog1 = new Dog("Ghost")
    println("Name of the dog is : "+dog1.getName())
    dog1.speak()
    val lab1 = new Labrador("Nimeria","White")
    println("**LABRADOR**")
    println("Name of the labrador is : "+lab1.getName())
    lab1.speak()
    println("color is : "+lab1.getColor())
    println("average weight of this breed is : "+lab1.avgBreedWeight())
    val york1 = new Yorkshire("Summer","Black-Grey")
    println("**YORKSHIRE**")
    println("Name of the Yorkshire is : "+york1.getName())
    york1.speak()
    println("color is : "+york1.getColor())
  }
}
