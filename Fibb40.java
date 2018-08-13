import java.util.*;
import java.lang.*;
import java.io.*;
class Fibb40
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		 for (int i = 1; i <= n; ++i)
        {
            int sum = a+b;
            a=b;
            b=sum;
        System.out.printf(a+" ");
        }
    
	}
}
