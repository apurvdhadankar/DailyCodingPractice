package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharCount {

	public static void main(String[] args) {
		/*
		 * Count the number of occurrences of each character in a string
		 * 
		 * Input: "Hello world!" Expected Output: {H=1, e=1, l=3, o=2, =1, w=1, r=1,
		 * d=1, !=1}
		 */
		
		String s = "Hello World!";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i=0; i<s.length(); i++)
		{
			if (map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
			else if (!Character.isSpace(s.charAt(i)))
			{
				map.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(map);

	}

}
