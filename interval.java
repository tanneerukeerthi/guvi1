/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int num,m,n;
	  Scanner sc=new Scanner(System.in);
	  m=sc.nextInt();
	  n=sc.nextInt();
	  for(num=m;num<n;num++)
	  {
	  	if(num%2==1)
	  	{
	  		System.out.print(num+"\t");
	  	}
	  }
	}
}
