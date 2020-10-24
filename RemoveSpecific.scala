// Scala program to remove specific element from an array.

def remele(arr : Array[Int], value : Int) = {
	if(arr.contains(value))
	{
		var arr_buff = arr.toBuffer // conversion to ArrayBuffer
		arr_buff -= value
		arr_buff.toArray  // conversion to Array
		println(arr_buff)
	}
}

var numarr = Array(1,7,2,5,9)
var value = 2

remele(numarr, value)   // ---> 1,7,9,5