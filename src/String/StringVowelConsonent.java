package String;

public class StringVowelConsonent {

	public static void main(String[] args) {
		String s= "shubhamkumareq";
		String a = s.toLowerCase();
		char[] st = a.toCharArray();
		for (int i = 0; i < st.length; i++)
		{
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
		{
			System.out.println(st[i]+" this is vowel");
		}
		else
		{
			System.out.println(st[i]+"  this is consonent");
		}
		}

	}

}
