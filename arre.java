import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class arre
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0;
		int l=0;
		int u=sc.nextInt();
		int v=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==u)
			{
				k=i;
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==v)
			{
				l=i;
				break;
			}
		}
		if(l>k)
		{
			l=l-k;
		}
		else
		{
			l=k-l;
		}
		System.out.println(l);
	}
}
