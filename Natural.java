/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Natural
{
	public static void main (String[] args) throws java.lang.Exception
{
	int sum=0,i;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(i=1;i<=n;i++)
	{
	sum=sum+i;
	}
	System.out.println(sum);
	
}
	
}
