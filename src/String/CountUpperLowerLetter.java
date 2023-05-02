package String;

import java.util.Scanner;

public class CountUpperLowerLetter {
	

	public static void main(String[] args)
	{
		for(;;)
		{
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int uppercase=0;
		int lowercase=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
					{
				uppercase++;
					}
			
		}
		System.out.println("total number of lowercase "+lowercase);
		System.out.println("totalnumber of uppercase "+uppercase);
		
}
}
}