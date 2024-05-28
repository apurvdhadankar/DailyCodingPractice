package strings;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello";
		char[] ch = s.toCharArray();
		
		for (int i=0; i<ch.length/2; i++)
		{
			char temp = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = temp;
		}
		
		System.out.println(ch);
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
		
		String reversed = "";
		for (int i=s.length()-1; i>=0; i--)
		{
			reversed += s.charAt(i);
		}
		
		System.out.println(reversed);

	}

}
