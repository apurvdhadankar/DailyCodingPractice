package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPossibleSubSequences {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4}; // 15 subsequences <- 2^n - 1
		// (1), (2), (3), (4), (1,2), (1,3),(1,4), (2,3), (2,4), (3,4), (1,2,3), (1,2,4), (1,3,4), (2,3,4), (1,2,3,4).
		// 2^n - 1
		printAllPossibleSubSequences(a, a.length);
		
	}

	private static void printAllPossibleSubSequences(int[] a, int n)
	{
		int subSrquenceCount = 0;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<>());
		for (int num : a)
		{
			int size = list.size();
			for (int i=0; i<size; i++)
			{
				List<Integer> l = new ArrayList<Integer>(list.get(i));
				l.add(num);
				list.add(l);
				
				
			}
		}
		System.out.println(list.size()-1);
		for (List<Integer> l : list)
		{
			System.out.println(l);
		}
		
		
	}

}
