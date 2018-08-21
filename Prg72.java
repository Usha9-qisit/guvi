import java.util.*;
import java.lang.*;
import java.io.*;
class Prg72
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		if(str.charAt(i)== 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)== 'o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
		{
			count++;
			}
		if(count>0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
