import java.util.*;
import java.lang.*;
import java.io.*;
class Nearten67
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b;
		if(a%10==0)
		{
		System.out.println(a);
		}
		else
		{
			a=(a/10)*10;
			b=a+10;
		            System.out.println(b);
		}
	}
}
