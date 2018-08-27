import java.util.*;
import java.lang.*;
import java.io.*;
class Kabali81
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
		System.out.println(a-b);
		else
		System.out.println(Math.abs(a-b));
	}
}
