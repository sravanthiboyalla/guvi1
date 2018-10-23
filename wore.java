import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class wore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				k=i;
			}
		}
		String rev=s.substring(k+1,s.length())+" "+s.substring(0,k);
		System.out.println(rev);
	}
}
