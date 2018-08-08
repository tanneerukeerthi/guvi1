/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		char ch;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
