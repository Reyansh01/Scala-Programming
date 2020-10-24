// print area of rectangle by taking input drom the user using classes and objects.

class Rectangle(var l : Int, var b : Int)
{
	def returnArea : Int = {
		return(l*b)
	}
}

var length = readInt()   // ---> 5
var breadth = readInt()  // ---> 10

print("Value of length is : "+length)
print("Value of Breadth is : "+breadth)

var obj = new Rectangle(length,breadth) // creation of object

obj1.returnArea // calling
// ---> 50

//we can also use this to call the above method.
new Rectangle.returnArea(length,breadth)   // ---> 50