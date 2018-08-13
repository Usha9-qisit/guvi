import java.util.*;
import java.lang.*;
import java.io.*;
class Mh30
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int hr1=s.nextInt();
		int min1=s.nextInt();
		int hr2=s.nextInt();
		int min2=s.nextInt();
		System.out.println(Math.abs(hr1-hr2)+" "+Math.abs(min1-min2));
	}
}
