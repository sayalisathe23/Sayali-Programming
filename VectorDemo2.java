import java.io.*;
import java.util.*;
class VectorDemo2
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		{
			v.add(10);
			v.add(20);
			v.add(30);
			v.add(40);
			v.add(50);
			System.out.println("Vector="+v);
			System.out.println("Vector Size="+v.size());
			System.out.println("Vector Capacity="+v.capacity());
			v.add("Kpc");
			System.out.println("Vector="+v);
			System.out.println("Vector Size="+v.size());
			System.out.println("Vector Capacity="+v.capacity());
			v.removeElement("Kpc");
			System.out.println("Vector="+v);
			System.out.println("Vector Size="+v.size());
			System.out.println("Vector Capacity="+v.capacity());


		}
		

		

		

	}
}