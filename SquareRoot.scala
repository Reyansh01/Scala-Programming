// Square Root of a number

def sqrt(num : Int) : Int = {
	if(num == 0 || num == 1)
	{
		return num
	}
	else
	{
		var i = 1
		var res = 1
		while(res <= num)
		{
			i = i + 1
			res = i * i
		}
		return(i-1)
	}
}

sqrt(4)   // ---> 2
sqrt(9)   // ---> 3