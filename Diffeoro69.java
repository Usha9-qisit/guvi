import java.util.*;
import java.lang.*;
import java.io.*;
class Diffeoro69
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int res;
		res=Math.abs(N-M);
		if(res%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
	}
}
