import java.util.*;
import java.lang.*;
import java.io.*;
class Ar21
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int d=s.nextInt();
		System.out.println((n*(2*a+(n-1)*d))/2);
	}
}
