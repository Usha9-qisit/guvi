import java.util.*;
import java.lang.*;
import java.io.*;
class Set1_Player10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int len=str.length();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==str1.charAt(i))
			{
			count++;
			}
		}
		if(count==len)
		System.out.println("no");
		else
		System.out.println("yes");
	}
}
