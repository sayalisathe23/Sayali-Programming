import java.io.*;
import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Even No:"+i);

			if(i%==2)
			{
				System.out.println("Even No:"+i);
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			if(j!=2)
			{
				System.out.println("Odd No:"+j);
			}
		}
	}
}
class ThreadDemo3
{
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	C c=new C();
	a.start();
	b.start();
	c.start();
	}
}