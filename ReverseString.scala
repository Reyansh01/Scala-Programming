// Reversing a string using recursion

def reversestring(str : String) : String = {
	if(str.length == 1)
	{
		return str
	}
	else
	{
		reversestring(str.tail) + str.head  // tail function for end and head function for start.
	}
}

reversestring("reyansh")   // ---> hsnayer