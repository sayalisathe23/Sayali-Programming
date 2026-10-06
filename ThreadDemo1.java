
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

class ThreadDemo1
{
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	a.start();
	b.start();
	}
}