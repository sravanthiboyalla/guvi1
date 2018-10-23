import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sint
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a*b;
		String s=Integer.toString(c);
		System.out.println(s);
	}
}
