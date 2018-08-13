import java.util.*;
import java.lang.*;
import java.io.*;
class Min29
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int h=t/60;
		int min=t%60;
		System.out.println(h+" "+min);
	}
}
