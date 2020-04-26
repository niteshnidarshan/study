package com.sys.comparable_comparator;

import java.io.IOException;

public class xyz {
	public static String m(xyz o1, xyz o2) {
	    String s1 = o1 == o2 ? "T" : "F";
	    String s2 = o1.equals(o2) ? "T" : "F";
	    String s3 = o1.hashCode() == o2.hashCode() ? "T" : "F";
	    return s1 + s2 + s3;
	}
    public static void main(String arg[])
    {
    	/*Integer a = null;
    	int b = a;
    	System.out.println(b);*/
    	/*try {
    	    int c = 1/0;
    	} catch (Exception e) {
    	    System.out.println("E");
    	} finally {
    	    System.out.println("F");
    	}*/
    	System.out.println(m(new xyz(), new xyz()));
    }
}
 