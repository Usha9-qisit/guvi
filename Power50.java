import java.util.*;
import java.lang.*;
import java.io.*;
class Power50
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  boolean res=power(n);
	  if(res)
	  System.out.println("yes");
	  else
	  System.out.println("no");
	 }
	 public static boolean power(int n)
	 {
	 	if(n==0)
	 	return false;
	 	else
	 	{
	 		if(n%2!=0)
	 		return false;
	 		else
	 		n=n/2;
	 	}
	 	return true;
	 }
	
}
