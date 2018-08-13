import java.util.*;
import java.lang.*;
import java.io.*;
class Str27
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean numeric=true;
		try{
			Double num=Double.parseDouble(str);
		}catch(NumberFormatException e)
		{
			numeric=false;
		}
		if(numeric)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
