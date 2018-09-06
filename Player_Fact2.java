import java.util.*;
import java.lang.*;
import java.io.*;
class Player_Fact2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    
	}
}
