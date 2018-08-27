import java.util.*;
import java.lang.*;
import java.io.*;
class Lcm88
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int lcm;
		lcm = (n > m) ? n : m;
        while(true)
        {
            if( lcm % n == 0 && lcm % m == 0 )
            {
                System.out.println( lcm);
                break;
            }
            ++lcm;
        }
	}
}
