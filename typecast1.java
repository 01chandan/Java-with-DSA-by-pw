// Typecasting converting one data type to another
// 1. Widening Typecasting (implicitly)	2. Narrowing Typingcasting (Explicitly)

//widening typecasting is always work on lower to hight only.
//Note:- Both data type must be compatable (Ex- int and byte are compatable)
import java.lang.*;
class typecast
{
	public static void main(String  args[])
	{
		byte b = 20;
		int i = b;	// widening typecasting (lower to high)
		b = (byte)i; // Narrow typecasting	(high to lower)
		
		System.out.println("Widening Typecast: " +i);
		System.out.println("Narrow Typecast" +b);
	}
}
/*
	Note:-
	char 'A' cannot type cast in Sting in any method because char contain 1 character at a time
	but string contain group of character i.e word.
*/