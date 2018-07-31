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
		int even=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			even=i;
		}
		System.out.println(even);
	}
}
