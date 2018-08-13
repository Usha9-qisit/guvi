import java.util.*;
import java.lang.*;
import java.io.*;
class Arrmin23
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
	            int min=a[0];
	            for(i=0;i<n;i++)
	            {
	            	if(min>a[i])
	            	min=a[i];
	            	else
	            	min=min;
	            }
	            System.out.println(min);
	}
}
