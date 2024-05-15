package arrays;

import java.math.BigInteger;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {
		//int n = 25;
		// Output: 15511210043330985984000000
		
		BigInteger n = findFactorial(25); // O(n)
		System.out.println(n);
		
		System.out.println(findFactorialUsingRecursion(25)); // O(n)

	}

	private static BigInteger findFactorial(int n) 
	{
		// 6! == 6*5*4*3*2*1 = 720. 
		BigInteger fact = new BigInteger("1");
		for (int i=2; i<=n; i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	
	private static BigInteger findFactorialUsingRecursion(int i) 
	{
		if (i == 0)
		{
//			return 1;
			return new BigInteger("1");
		}
		
		//return i * findFactorialUsingRecursion(i -1);
		return BigInteger.valueOf(i).multiply(findFactorialUsingRecursion(i - 1));
	}
}
