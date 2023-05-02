package String;

public class VowelConsonent {
	
	
	
	
	static void vowel_consonent(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
		{
			System.out.println("its is vowel");
		}
		else
		{
			System.out.println("it is consonent");
		}
	}

	public static void main(String[] args)
	{
	
vowel_consonent('f');
	}

}
