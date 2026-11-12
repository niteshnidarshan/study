
public class GCD_OR_HCF {

	/***
	 * This class gives the solutions for GCD/ HCF
	 * Greatest Common Divisor/ Highest Common Factor
	 */
	
	public static int getGCD(int p, int q)
	{
		/**
		 * getGCD() returns GCD value according to recursion.
		 * 
		 */
		if(q == 0)
			return p;
		int r = p%q;
		return getGCD(q,r);
		
	}
	
	public static void main(String[] args) {
		 System.out.println(getGCD(8,12)); 
	}

}
