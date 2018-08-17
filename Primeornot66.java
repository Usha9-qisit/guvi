import java.util.*;
import java.lang.*;
import java.io.*;
class Primeornot66
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
			}
		}if(flag==false)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
