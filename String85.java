import java.util.*;
import java.lang.*;
import java.io.*;
class String85
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str1="";
		String str2="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
				str1=str1+s.charAt(i);
				else
				str2=str2+s.charAt(i);
	
		}
		System.out.println(str1+" "+str2);
	
	}
}
