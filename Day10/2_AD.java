package strings;

public class CountWords {

	public static void main(String[] args) {
		String s = "Hello World";
		
		String[] sArr = s.trim().split(" ");
		System.out.println(sArr.length);
		
		String sNew = s.trim();
		int cnt = 0;
		for (int i=0; i<sNew.length(); i++)
		{
			if (sNew.charAt(i) == ' ')
			{
				cnt++;
			}
		}
		
		System.out.println(cnt+1);
		
		s = "Hello  p 90 7 a world india t jj";
		cnt = 0;
		int chars = 0;
		boolean isWord = false;
		for (int i=0; i<s.length(); i++)
		{
			if (Character.isLetter(s.charAt(i)) && i+1 < s.length())
			{
				chars++;
				isWord = true;
			}
				
			else if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && isWord && chars > 1)
			{
				cnt++;
				isWord = false;
				chars = 0;
			}
		}
		
		System.out.println(cnt);

	}

}
