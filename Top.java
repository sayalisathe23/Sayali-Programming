import java.io.*;
import java.util.*;
class Top
{
	public static void main(String args[])
	{
		String s="MSBTE";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passward");
		String pwd=sc.next();
		
		if(s.compareTo(pwd)==0)
		{
			System.out.println("Good");
		}
		else
		{
			System.out.println("Wrong");
		}
		StringBuffer s1=new StringBuffer("Java");
		s1=s1.reverse();
		System.out.println("Reverse string"+s1);
		s1=s1.append("Welcome");
		System.out.println("Append string"+s1);
	}
}
	