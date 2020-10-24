def armstrong(n : Int) : Boolean = {
	var tem = n
	var res = 0
	while(tem != 0)
	{
		var rema = tem % 10
		res += rema*rema*rema
		tem = tem / 10
	}
	if(res == n)
	{
		return true
	}
	else
	{
		return false
	}
}

armstrong(153)   // ---> true
armstrong(123)   // ---> false