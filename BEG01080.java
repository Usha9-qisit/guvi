import java.util.*;
import java.lang.*;
import java.io.*;
class BEG01080
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=1;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println(a[k]);
		
	}
}
