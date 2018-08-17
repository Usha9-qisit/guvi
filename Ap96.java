import java.util.*;
import java.lang.*;
import java.io.*;
class Ap96
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int A=s.nextInt();
	int B=s.nextInt();
	int C=s.nextInt();
	int a=A,d=B,n=C;
	int res;
	res=(n*((2*a)+(n-1)*d))/2;
	System.out.println(res);
	}
}
