import java.util.*;
import java.lang.*;
import java.io.*;
class Spc36
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(!(Character.isDigit(str.charAt(i))) && !(Character.isAlphabetic(str.charAt(i))))
			{
			 count++;
			}
		}
		System.out.println(count);
	}
}
