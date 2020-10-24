def leapyr(yr : Int) = {
	if(yr % 4 == 0 || yr  % 100 == 0 && yr % 400 == 0)
	{
		println("This is a Leap Year.")
	}
	else
	{
		println("This is not a leap year.")
	}
}

leapyr(2020)   // ---> This is a Leap Year.

leapyr(1990)   // ---> This is not a Leap Year.