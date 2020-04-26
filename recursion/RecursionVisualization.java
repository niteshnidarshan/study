package com.sys.recursion;

public class RecursionVisualization {

	public int print(int n)
	{
		if(n==0)					//A base case
			return 0;
		else
		{
			System.out.println(n);
			return print(n-1);		//A recursive call to itself
		}
	}
	public static void main(String[] args) {
		RecursionVisualization rv = new RecursionVisualization();
		int result = rv.print(5);
		System.out.println("Result = "+result);  
	}

}
