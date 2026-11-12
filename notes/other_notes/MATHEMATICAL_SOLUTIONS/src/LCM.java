
public class LCM {
	/***
	 * 
	 * Lowest Common Multiple
	 * 
	 * LCM is obtained by the following formula
	 * LCM(p,q) = p*q/gcd(p,q)
	 * 
	 * 
	 */
	
	private static int getGcd(int p, int q)
	{
		if(q == 0) return p;
		
		int reminder = p%q;
		
		return getGcd(q,reminder); 
		
	}
	
	public static int getLcm(int p, int q)
	{
		return (p*q/getGcd(p, q));
	}
	

	public static void main(String[] args) {
		 System.out.println(getLcm(18,3));

	}

}
