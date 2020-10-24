// types of for loop that can be used to print numbers from 1 to 5.

// until() method
for(i <- 1 until 6)  // can also be written as (i <- 1.until(6))
{
	println(i)
}

// to() method
for(i <- 1 to 5)  // can also be written as (i <- 1.to(5))
{
	println(i)
}

//List
val list = List(1,2,3,4,5)
for(i <- list)
{
	println(i)
}

//Condition with for loops.
for(i <- list; if(i % 2 == 0)
{
	println(i)
}
/* 
2
4
*/


//Expression
val ans = for{ i <- list; if(i % 2 == 0) } yield { i * i }
{
	println(ans)
}
/*
4
16
*/