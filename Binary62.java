import java.util.*;
import java.lang.*;
import java.io.*;
class Binary62
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(String.valueOf(str).matches("[0-1]+"))
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
