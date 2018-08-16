/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,k;
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>0&&n2>0)
		{
		   if(k>n1&&k<n2||k<n1&&k>n2)
		   System.out.println("yes");
		   else
		   System.out.println("no");
		}
		else
		System.out.println("enter positive values");
		
	}
}
