package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeOverlappingItervals {

	public static void main(String[] args) {
		/*
		 * Input: Interval = {{1,3},{2,4},{6,8},{9,10}} Output: {{1, 4}, {6, 8}, {9, 10}}
		 *  
		 * Explanation: Given Interval: [1,3],[2,4],[6,8],[9,10], we have only two
		 * overlapping Interval here,[1,3] and [2,4]. Therefore we will merge these two
		 * and return [1,4],[6,8], [9,10].
		 * 
		 * Input: Interval = {{6,8},{1,9},{2,4},{4,7}} Output: {{1, 9}}
		 */
		
		Interval a[] = new Interval[4];
//		a[0] = new Interval(6, 8);
//        a[1] = new Interval(1, 9);
//        a[2] = new Interval(2, 4);
//        a[3] = new Interval(4, 7);
        
        a[0] = new Interval(1, 3);
        a[1] = new Interval(2, 4);
        a[2] = new Interval(6, 8);
        a[3] = new Interval(9, 10);
		
		mergeIntervals(a); //O (NLogN) Sorting
 		
		int[][] b = {
					{1, 3},
					{2, 4},
					{6, 8},
					{9, 10}
					};
		
		System.out.println(Arrays.deepToString(mergeIntervalsUsingMap(b)));
		int[][] res = mergeIntervalsUsingMap(b);
		
		for (int[] row : res)
		{
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static int[][] mergeIntervalsUsingMap(int[][] intervals) 
	{
        HashMap<Integer,Integer> map = new HashMap();
        List<List<Integer>> l = new ArrayList<List<Integer>>();
       
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        
        for(int i=0;i<=intervals.length-1;i++)
        {
           if(map.containsKey(intervals[i][0]))
           {
               map.put(intervals[i][0],Math.max(map.get(intervals[i][0]),intervals[i][1]));
           }
           else 
        	   map.put(intervals[i][0],intervals[i][1]);
        }
        for(int i=0;i<=intervals.length-1;i++)
        {
              List<Integer> ans = new ArrayList();
            if(!map.containsKey(intervals[i][0]))
            {
                continue;
            }   
             
            ans.add(intervals[i][0]);
                ans.add(intervals[i][1]);
                
            
            for(int j=intervals[i][0];j<=intervals[i][1];j++)
            {
              
                if(map.containsKey(j))
                {
                    if(ans.get(1)<=map.get(j))
                    {
                    ans.remove(1);
                    ans.add(map.get(j));
                        intervals[i][1]=map.get(j);
                        map.remove(j);
                    }
                    else
                    {
                        map.remove(j);
                    }
                }
            }
            l.add(ans);
        }
        
        int[][] a = new int[l.size()][2];
        
        for(int i=0;i<=l.size()-1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                a[i][j]=l.get(i).get(j);
            }
        }
        return a;
    }

	private static void mergeIntervals(Interval[] a)
	{
		// Sort Interval by comparing start elements of the Interval
		Arrays.sort(a, new Comparator<Interval>()
		{
            public int compare(Interval i1, Interval i2)
            {
                return i1.start - i2.start;
            }
        });
		
		System.out.println(Arrays.toString(a));
		
		int index = 0;
		for (int i=0; i<a.length; i++)
		{
			if (a[index].end >= a[i].start)
			{
				a[index].end = Math.max(a[index].end, a[i].end);
 			}
			else
			{
				index++;
				a[index] = a[i];
			}
		}
		
		
		// Now arr[0..index-1] stores the merged Intervals
        System.out.print("The Merged Intervals are: \n");
		for (int i=0; i<= index; i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}

class Interval
{
	int start, end;
	public Interval(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString()
	{
		return "Interval: "+ start + " " + end;
	}
	
}
