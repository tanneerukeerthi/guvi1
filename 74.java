/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		float a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		if(a>0)
		{
		    int c=(int)Math.ceil(a);
		    System.out.println(c);
		}    
		else
		System.out.println("enter positive numbers");
	}
}
