import java.lang.*;
import java.util.*;
class keyboard_read
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a, b;
		System.out.println("Enter 2 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a+b;
		System.out.println("Sum is " + c);
	}


}