/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		r=n+10;
		if(n>0)
		{
			for(i=n;i<=r;i++)
			{
				if(i%10==0)
				{
					break;
				}
			}
		System.out.println(i);
		}
		else
		System.out.println("enter only positive numbers");
		}
}
