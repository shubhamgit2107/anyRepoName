package String;

import java.util.Scanner;

public class ReversseSTring {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		
	//String rev=" "; 
	
		//for (int i=s.length()-1; i>=0; i--) 
		//{
		///rev=rev+s.charAt(i);
			
	
		//}
	//	System.out.println(rev); 
		
	//	StringBuilder buil= new StringBuilder();
	//	buil.reverse();
		char[] ch = s.toCharArray();
		for (int i = ch.length-1; i>=0; i--) 
		{
		System.out.print(ch[i]);	
		}
	}
	
		
		

}
