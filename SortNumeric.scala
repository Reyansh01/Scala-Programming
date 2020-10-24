// sorting numeric array.

def sortnum(numarr : Array[Int]) : Array[Int] = {
	var temp = 0
	for(i <- 0 until numarr.length-1)
	{
		for(j <- 0 until numarr.length-i-1)
		{
			if(numarr(j) > numarr(j + 1))
			{
				temp = numarr(j)
				numarr(j) = numarr(j+1)
				numarr(j+1) = temp
			}
		}
	}
	return numarr
}

var numarr = Array(1,7,2,9,5)
sortnum(numarr)   // ---> 1,2,5,7,9