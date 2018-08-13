import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
class Asort24
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
	           Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			if(i==n-1)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
		
		
	}
}
