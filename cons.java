/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Vowel");
		}
		else if(ch=='b'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z'||ch=='B'||ch=='D'||ch=='F'||ch=='G'||ch=='H'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
		{
			System.out.println("Consonants");
		}
		else
		System.out.println("invalid");
	}
}
