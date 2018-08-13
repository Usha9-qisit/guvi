import java.util.*;
import java.lang.*;
import java.io.*;
class Swap37
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
