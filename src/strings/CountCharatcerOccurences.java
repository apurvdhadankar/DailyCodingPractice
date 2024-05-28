package strings;

public class CountCharatcerOccurences {

	public static void main(String[] args) {
		/*
		 * Count the total number of occurrences of a given character in a string
		 * without using any loop
		 * 
		 * Input: "Hello world!", character: 'l' Expected Output: 3
		 */
		
		String s = "Hello World!";
	
		int counts = s.length() - s.replace("l", "").length();
		System.out.println(counts);
		
		
		char l ='l';
		int cnt = countChars(0, s, l);
		System.out.println(cnt);
	}

	private static int countChars(int idx, String s, char l)
	{
		if (idx == s.length())
		{
			return 0;
		}
		
		int cnt = 0;
		if (s.charAt(idx) == l)
		{
			cnt++;
		}
		
		cnt = cnt + countChars(idx + 1, s, l);
		return cnt;
	}

}
