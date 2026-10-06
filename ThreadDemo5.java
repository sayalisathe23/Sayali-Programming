import java.io.*;
import java.util.*;
class A extends Thread
{
	public void run()
	{
	for(int i=1;i<=5;i++)
	{
	if(i==2)
	{
	yield();
	}
	System.out.println("Thread A:"+i);
	}
	}
}
class B extends Thread
{
	public void run()
	{
	for(int j=1;j<=5;j++)
	{
	if(j==3)
	{
	stop();
	
	}
	System.out.println("Thread B:"+j);
	}
	}
}
class C extends Thread
{
	public void run()
	{
	for(int k=1;k<=5;k++)
	{
	try
	{
	if(k==1)
	{
	sleep(5000);
	
	}
	System.out.println("Thread C:"+k);
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	}
	}
	}
}
class ThreadDemo5
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