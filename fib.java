import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<=0)
		System.out.println("invalid");
		else if(n==1)
			System.out.println(1);
		else
		{
			
		int a=1,b=1,next;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++)
		{
			next=a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
		}
		}
	}
}
