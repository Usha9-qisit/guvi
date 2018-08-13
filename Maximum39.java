import java.util.*;
import java.lang.*;
import java.io.*;
class Maximum39
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n;
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		for(i=0;i<10;i++)
		{
		  a[i]=s.nextInt();
		}
	            int max=a[0];
	            for(i=0;i<10;i++)
	            {
	            	if(max<a[i])
	            	max=a[i];
	            	else
	            	max=max;
	            }
	            System.out.println(max);
	}
}
