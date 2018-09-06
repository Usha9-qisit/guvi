import java.util.*;
import java.lang.*;
import java.io.*;
class Player_Str1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}
}
