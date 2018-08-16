import java.util.*;
import java.lang.*;
import java.io.*;
class Sum64
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int result;
		result=n+m;
		if(result%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
	}
}
