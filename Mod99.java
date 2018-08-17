import java.util.*;
import java.lang.*;
import java.io.*;
class Mod99
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int res;
		res=(a*b)%c;
		System.out.println(res);
	}
}
