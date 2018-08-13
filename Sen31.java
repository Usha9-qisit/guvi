import java.util.*;
import java.lang.*;
import java.io.*;
class Sen31
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] ch = str.toCharArray();
		int letter=0;
		for(int i = 0; i < str.length(); i++)
			if(Character.isLetter(ch[i]))
			{
				letter ++ ;
			}
				System.out.println(letter);
			
	}
}
