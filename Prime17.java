import java.util.*;
import java.lang.*;
import java.io.*;
class Prime17
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a+1;i<b;i++)
	    {
	    	int counter=0;
	    	for(int num=1;num>=1;num--)
	    	{
	    		counter=counter+1;
	    	}
	    	if(counter==2)
	    	{
	    		System.out.println(i+" ");
	    	}
	    }
	}
}
