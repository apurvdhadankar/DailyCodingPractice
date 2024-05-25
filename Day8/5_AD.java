package arrays;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		/*
		 * Given an array prices[] of length N, representing the prices of the stocks on
		 * different days, the task is to find the maximum profit possible by buying and
		 * selling the stocks on different days when at most one transaction is allowed.
		 * 
		 * Note: Stock must be bought before being sold.
		 * 
		 * Examples:
		 * 
		 * Input: prices[] = {7, 1, 5, 3, 6, 4} Output: 5 Explanation: The lowest price
		 * of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day,
		 * the highest price of the stock is witnessed on the 5th day, i.e. price = 6.
		 * Therefore, maximum possible profit = 6 – 1 = 5.
		 * 
		 * Input: prices[] = {7, 6, 4, 3, 1} Output: 0 Explanation: Since the array is
		 * in decreasing order, no possible way exists to solve the problem.
		 */
		
		int[] a = {7, 1, 5, 3, 6, 4};
		int maxProfit = bestTimeToButAndSell(a, a.length);
		System.out.println(maxProfit);

	}

	private static int bestTimeToButAndSell(int[] a, int n)
	{
		int buy = 0, profit = 0;
		buy = a[0];
		for (int i=0; i<n-1; i++)
		{
			if (a[i] < buy)
			{
				buy = a[i];
			}
			else if (a[i] - buy > profit)
			{
				profit = a[i] - buy;
			}
		}
		return profit;
	}

}
