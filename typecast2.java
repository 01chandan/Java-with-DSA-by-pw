
//when we perform addition in two byte then result will automatically convert into an integer
//To solve this problem perform narrow typecast
import java.lang.*;
class typecast
{
	public static void main(String args[])
	{
		byte a = 10;
		byte b = 20;
		
		byte c = (byte)(a + b);
		
		
		System.out.println("Result:" +c);
	}
}