import java.io.*;
import java.util.*;
class A extends Thread
{
	public void run()
	{
	
	System.out.println("ThreadA Priority="+Thread.currentThread().getPriority());
	System.out.println("Thread Name="+Thread.currentThread().getName());
	
	}
}
class B extends Thread
{
	public void run()
	{
	System.out.println("ThreadB Priority="+Thread.currentThread().getPriority());
	System.out.println("Thread Name="+Thread.currentThread().getName());
	}
}
class C extends Thread
{
	public void run()
	{
	System.out.println("ThreadC Priority="+Thread.currentThread().getPriority());
	System.out.println("Thread Name="+Thread.currentThread().getName());
	}
}
class ThreadDemo7
{
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	C c=new C();
	a.setPriority(Thread.MIN_PRIORITY);
	b.setPriority(Thread.NORM_PRIORITY);
	c.setPriority(Thread.MAX_PRIORITY);
	a.start();
	b.start();
	c.start();
	}
}