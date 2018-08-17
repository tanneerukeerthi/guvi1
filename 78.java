/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			if(n%13==0)
			System.out.println("yes");
			else
			System.out.println("no");
		}
		else
		System.out.println("enter only positive number");
	}
}
