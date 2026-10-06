import java.io.*;
import java.util.*;
import java.lang.*;
class Demo10
{
	public static void main(String args[])
	{
		vector v=new vector(5);
		v.addElement(5);
		v.addElement(15);
		v.addElement(25);
		v.addElement(35);
		v.addElement(45);

		v.insertElement(55,1);
		System.out.println("Total elements in vector"+v);
		v.remove(1);
		v.remove(3);
		System.out.println("Total elements in vector"+v);
	}
}