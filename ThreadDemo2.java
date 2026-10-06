import java.io.*;
import java.util.*;
class A extends Thread
{
	public void run()
	{
	System.out.println("Thread A:");
	}
}
class B extends Thread
{
	public void run()
	{
	System.out.println("Thread B:");
	}
}
class C extends Thread
{
	public void run()
	{
	System.out.println("Thread C:");
	}
}
class ThreadDemo2
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