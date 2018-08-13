import java.util.*;
import java.lang.*;
import java.io.*;
class Fact19
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int i,fact=1;
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 for(i=1;i<=n;i++)
	 {
	 	fact=fact*i;
	 }
	 System.out.println(fact);
	}
}
