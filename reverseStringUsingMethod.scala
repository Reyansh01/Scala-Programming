// reverse a string without head and tail.

var name = "Reyansh"
name.reverse  // direct method to reverse a string.
// ---> hsnayeR

def reverstr(name : String) : String = {
	var finalstr = " "
	val len = name.length()
	for(i <- 0 to len-1)
	{
		finalstr = finalstr.concat(name.charAt(len-i-1).toString)
	}
	return finalstr
}

reverstr(name)   // ---> hsnayeR