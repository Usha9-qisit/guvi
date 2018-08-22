import java.util.*;
import java.lang.*;
import java.io.*;
class Perfect79
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int res=n*m;
		int sqr=(int)Math.sqrt(res);
		if(sqr*sqr==res)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
