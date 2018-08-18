import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
