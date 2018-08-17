import java.util.*;
import java.lang.*;
import java.io.*;
class Kvalue94
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(i=1;i<n;i++)
		{
		  a[i]=s.nextInt();
		}
		for(i=1;i<n;i++)
		{
	              if(i==k)
	            	System.out.println(a[i]);
		}
	}
}
