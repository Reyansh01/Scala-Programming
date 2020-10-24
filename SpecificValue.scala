// Scala program to test if an array contains specific value or not.

def specval(arr : Array[Int], num : Int) = {
	var count = 0
	for(i <- 0 to arr.length-1)
	{
		if(arr(i) == num)
		{
			count = count+1
		}
	}
	if(count >= 1)
	{
		println("Nuumber is present.")
	}
	else
	{
		println("Number is not present.")
	}
}

var numarr = Array(1,7,2,9,5)
var num = 7

specval(numarr,num)  // ---> Number is present.

var num2 = 10

specval(numarr,num)   // ---> Number is not present.