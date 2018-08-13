import java.util.*;
import java.lang.*;
import java.io.*;
class Am18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, n1, n2, i, rem, temp;
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        n2 = scan.nextInt();
	 for(i=n1+1; i<n2; i++)
        {
            temp = i;
            n = 0;
            while(temp != 0)
            {
                rem = temp%10;
                n = n + rem*rem*rem;
                temp = temp/10;
            }
            if(i == n)
            {
              System.out.print(i);
              }
		 else
			 System.out.print(" ");
        }
       
    
	}
}
