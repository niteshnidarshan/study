package com.sys.comparable_comparator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test extends Thread{
	Test(){
		System.out.println("c");
	}
/*void display(Object o)
{
	System.out.println("x");
}
void display(String x)
{
	System.out.println("Y");
}
class Bar
{
	Bar()
	{
		System.out.println("bar");
	}
	public void go()
	{
		System.out.println("go");
	}
}
void makeBar()
{
	(new Bar(){}).go();
}*/
	
	//static int[] i;
	//static {i[0] = 11;}
	
	public static <T extends Comparable<T>> int counte(T anArray[], T elem)
	{
		int c = 0;
		for(T e: anArray)
			if(e.compareTo(elem) > 0)
				++c;
		
		return c;
	}
	
	/*public void start()
	{
		System.out.println("Start");
	}*/
	public void run()
	{
		System.out.println("Run");
	}
	public static void main(int s[])
	{
		System.out.println("Jay Ram G ki");
	}
public static void main(String a[])
{
	//new Test().display(null);
	//Test t = new Test();
	Test t1 = new Test() {public void run(){System.out.println("xx");}};
	t1.start();
	
	//t.run();
	//t1.run();
	//t.start();
	//t1.start();
	
	//t.makeBar();
	
	//int x[] = new byte[4];
	int y[] = new int[2];
	int ax, b[];
	
	//b=y;
	//System.out.println(b[2]);
	try
	{
		System.out.println("division");
		
		//int x = 10/0;
		//System.out.println(x);
		
	}catch(Exception e)
	{
		//System.out.println(e.printStackTrace());
	}
	
	List<Object> lo = new ArrayList<>();
	List<?> ll = new ArrayList<>();
	lo.add("");
	//ll.add(""); compilation error
	int arr[] = {1,3,6,5,10};
	//int count = counte(arr,4);//compile error
	
	Set<Integer> set = new HashSet<Integer>();
	Integer itr = 40;
	Integer itr2 = 50;
	set.add(itr);
	set.add(itr);
	set.add(itr2);
	set.remove(itr);
	itr2 = 47;
	set.remove(itr2);
	System.out.println(set.size()+""+set.toString());
	
	
}
}

