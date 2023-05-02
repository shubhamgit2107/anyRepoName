package String;

import java.util.Scanner;

public class PalendronString {

	public static void main(String[] args) 
	{
		for(;;)
		{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
	 rev= rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("number is palandrom");
		}
		else
		{
			System.out.println("number is not palandrom"); 
		}

	}

}
}
