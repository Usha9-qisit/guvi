import java.util.*;
import java.lang.*;
import java.io.*;
class Player_Rev3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
            System.out.println(a);
 
	}
}
