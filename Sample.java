
import java.util.*;
import java.lang.*;
import java.io.*;
import java .util.Scanner;
class Sample
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("positive number");
		}else if(n<0)
		{System.out.println("negative number");
                        }else if(n==0)
                        {
                        	System.out.println("neither a negative or a positive number ");
                        }
}
}
