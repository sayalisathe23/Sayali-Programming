import java.io.*;
import java.util.*;
class A implements Runnable
{
	public void run()
	{
	for(int i=1;i<=5;i++)
	{
	System.out.println("Thread A:"+i);
	}
	}
}
class B implements Runnable
{
	public void run()
	{
	for(int j=1;j<=5;j++)
	{
	System.out.println("Thread B:"+j);
	}
	}
}
class C implements Runnable
{
	public void run()
	{
	for(int k=1;k<=5;k++)
	{
	System.out.println("Thread C:"+k);
	}
	}
}
class ThreadDemo4
{
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	C c=new C();
	Thread t1=new Thread(a);
	Thread t2=new Thread(b);
	Thread t3=new Thread(c);
	t1.start();
	t2.start();
	t3.start();
	}
}