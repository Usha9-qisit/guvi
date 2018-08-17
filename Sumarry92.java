import java.util.*;
import java.lang.*;
import java.io.*;
class Sumarry92
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		  a[i]=s.nextInt();
		}
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
