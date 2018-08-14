/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = null;
		String str1 = null;
		// create object for scanner class
		sc = new Scanner(System.in);
		if (sc != null) {
		 str1 = sc.nextLine();
	}
	strPalindrom(str1);
}

static void strPalindrom(String str)
{
    // converting string into array
    char ch[] = str.toCharArray();
    // check string is Palindrom or not
    int count = ch.length - 1;
    for (int i = 0; i < ch.length; i++, count--)
    {
        if (ch[i] != ch[count])
	{
            	System.out.println("no");
            	break;
	}
	else 
	{
                if (i == count)
                {
            	System.out.println("yes");
                }
	}
    } 
}
	
}
