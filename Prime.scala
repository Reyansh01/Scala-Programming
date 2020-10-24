// Prime number and whether the sum of two prime number is also prime or not?

def checkpr(number : Int) : Boolean = {
	if(number <= 1)
	{
		return false
	}
	for(i -< 2 to number/2)
	{
		if(number % i == 0)
		{
			return false
		}
	}
	return true
}

def sum(number : Int) : Boolean = {
	if(checkpr(number) && checkpr(number-2))
	{
		return true
	}
	else
	{
		return false
	}
}

sum(13)   // ---> true
sum(42)   // ---> false