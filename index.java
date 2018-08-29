
import java.util.*;
import java.lang.*;
import java.io.*;


class Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int num=s.nextInt();
		if(num>0)
		{
			System.out.println("positive");
		}
	else if(num<0)
	{
		System.out.println("negative");
	}
	else 
	{
		System.out.println("zero");
	}
	}
}
