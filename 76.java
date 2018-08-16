/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int n,i,factor=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
		     for(i=1;i<n;i++)
		     {
        		           if(n%i==0) 
            		factor=i;/*finds the largest proper divisor*/
		     }	
      
		     if(factor>1) 
        		      System.out.println("yes");
    	                 else 
                	     System.out.println("no");
		}
		else
		System.out.println("enter positive numbers");
	}
}
