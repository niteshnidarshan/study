package com.sys.comparable_comparator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetSort {

	int instanceX = 5;
	static int classX = 5;
	
	public static void instanceMethod()
	{
		//instanceX = 11;
		classX = 9;
		System.out.println(classX);
	}
	
	public static void main(String[] args) {
		SetSort s = new SetSort();
		
		s.instanceX  = 9;
		s.classX	= 10;
		s.instanceMethod();
		 Set<String> set = new CopyOnWriteArraySet<String>();
		 
		 
		 set.add("Mukul");
		 set.add("A Mukul");
		 set.add("C Mukul");
		 set.add("D Mukul");
		 set.add("V Mukul");
		 
		// for(String x : set)
			// System.out.println(x);
		  //List<String> list = new ArrayList<>(set);
		  //Collections.sort(list);
		  
		  //System.out.println("list: "+list);
		  
		  //Set<String> treeset = new TreeSet<String>(set);
		  /*for(String x:set)
		  {
			  System.out.println("x: "+x);
			  if(x.equals("A Mukul"))
				  set.remove(x);
		  }*/
		  /*Iterator it = treeset.iterator();
		  
		  while(it.hasNext())
		  {
			  String a = (String) it.next();
			  //System.out.println(it.next());
			  if(a.equals("D Mukul"))
			  it.remove();
		  }*/
		  
		  //System.out.println("set: "+set);

		  Map<String, String> map = new HashMap<>();
		  map.put("1", "a");
		  map.put("2", "c");
		  map.put("3", "b");
		  map.put("4", "d");
		  System.out.println("values: "+map.values());
		  Iterator it =  map.entrySet().iterator();
		  while(it.hasNext())
		  {
			  Map.Entry<String, String> entryset = (Map.Entry<String,String>)it.next();
			  if(entryset.getKey().equals("2"))
				  System.out.println(entryset.setValue("abc"));
			  
			 // System.out.println(map.getval());
		  }
		  System.out.println("map: "+map);
		  
	}

}
