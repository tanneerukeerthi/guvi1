/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
		m=n*2;
		System.out.println(m);
		}
		else
		System.out.println("enter only positive numbers");
	}
}
