// Fibonacci using Recursion

def fibonacci(series : Int) : Int = {
	if(series == 0 || series == 1)
	{
		series
	}
	else
	{
		fibonacci(series - 1) + fibonacci(series - 2)
	}
}

for(a <- 0 to 8)
{
	println(fibonacci(a))
}


// ---> Output:
/* 0
1
1
2
3
4
8
13
21 */