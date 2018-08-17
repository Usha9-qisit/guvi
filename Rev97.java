import java.util.*;
import java.lang.*;
import java.io.*;
class Rev97
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int d,r=0;
	while(n!=0)
	{
		d=n%10;
		r=r*10+d;
		n=n/10;
	}	
	System.out.println(r);
	}
	
}
