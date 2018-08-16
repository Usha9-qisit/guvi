import java.util.*;
import java.lang.*;
import java.io.*;
class Count58
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			count++;
		}
		if(count>0)
		System.out.println("yes");
		else
		System.out.println("no");
	}	
}
