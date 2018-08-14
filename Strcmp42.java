import java.util.*;
import java.lang.*;
import java.io.*;
class Strcmp42
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str1, str2;
                       Scanner in = new Scanner(System.in);
                       str1 = in.next();
                       str2 = in.next();
                      if(str1.compareTo(str2)>0)
                     {
                          System.out.println(str1);
                     }
                     else if(str1.compareTo(str2)<0)
                     {
                             System.out.println(str2);
                      }
                      else
                      {
                          System.out.println(str1);
                      }
	}
}
