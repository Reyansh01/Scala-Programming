// Decimal to binary number.

def decto bin(numb : Int) : Int = {
	var binary = 0
	var tempo = numb
	var powerr = 1
	while(tempo > 0)
	{
		var remr = tempo % 2
		binary = binary + (rem * powerr)
		tempo = tempo / 2
		powerr = powerr*10
	}
	return binary
}

dectobin(125)    // ---> 1111101
dectobin(9)     // ---> 1001