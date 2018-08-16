import java.util.*;
import java.lang.*;
import java.io.*;
class Salphanum56
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0,count1=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			count++;
			if(Character.isAlphabetic(str.charAt(i)))
			count1++;
			
		}
		if(count>0 && count1>0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
