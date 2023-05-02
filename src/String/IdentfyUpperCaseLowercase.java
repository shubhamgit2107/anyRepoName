package String;

import java.util.Scanner;

public class IdentfyUpperCaseLowercase {
	public static void main(String[] args)
	{
		for(;;)
		{
		System.out.println("enterthe number"); 
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
	char[] st = s.toCharArray();
		
		for (int i = 0; i < st.length; i++) 
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				System.out.println(st[i]+" letter is lower case");
			}
			else
			{
				System.out.println(st[i]+" letter is uper case");
			}
		}
		
		}
	}

}
