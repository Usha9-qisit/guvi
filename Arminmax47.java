import java.util.*;
import java.lang.*;
import java.io.*;
class Arminmax47
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	  	a[i]=s.nextInt();
	  }
	  int min=a[0];
	  int max=a[0];
	  for(int i=0;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	
		System.out.println(min+" "+max);
	}
	
}
