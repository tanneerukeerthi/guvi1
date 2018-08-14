/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,sub,b;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		sub=n2-n1;
		b=Math.abs(sub);
		if(b%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
	}
}
