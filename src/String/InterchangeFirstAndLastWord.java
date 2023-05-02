package String;

import java.util.Scanner;

public class InterchangeFirstAndLastWord {

	public static void main(String[] args)
	{
		for(;;)
		{
		System.out.println("enter the number"); 
	Scanner sc= new Scanner(System.in);
	String s = sc.nextLine();
	String[] st = s.split(" ");
	
	String temp=st[0];
	st[0]=st[st.length-1];
	st[st.length-1]=temp;
	for (int i = 0; i < st.length; i++) 
	{
		
		System.out.print(st[i]);
		
	}
	
	

	}

}
}
