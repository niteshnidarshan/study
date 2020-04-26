package com.sys.recursion;

public class Factorial {
	
	public static int getFactorial(int n)
	{
		if(n==0) return 1; 					//A base case
		else
		{
			System.out.println(n);
			return n*getFactorial(n-1);		//A recursive case
		}
	}
	
	public static void main(String[] args) {
		int result = getFactorial(4);
		System.out.println("result = "+result);
	}

}
