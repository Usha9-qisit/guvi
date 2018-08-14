import java.util.*;
import java.lang.*;
import java.io.*;
class Stack51
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<Integer>stack=new LinkedList<Integer>();
		while(n>0)
		{
			stack.push(n%10);
			n=n/10;
		}
		while(!stack.isEmpty())
		System.out.printf(stack.pop()+" ");
	}
}
