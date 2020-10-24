// Binary to Decimal number.

def bintodec(num : Int) : Int = {
	var decimal = 0
	var power = 1
	var temp = num
	while(temp != 0)
	{
		var rem = temp % 10
		decimal = decimal + rem * power
		temp = temp / 10
		power = power*2
	}
	return decimal
}

bintodec(1001)  //  ---> 9
bintodec(110101)  // ---> 53