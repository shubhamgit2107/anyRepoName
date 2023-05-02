package LogicalProgram;

import java.util.Scanner;

public class RangeOfPrime {

	public static void main(String[] args) 
	{
		int min=0;
		int  max=0;
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the minimum value"); 
		min=sc.nextInt();
		System.out.println("enter the maximum value");
		max=sc.nextInt();
		for (int n = min; n <= max; n++)
		{
		for (int i = 2; i <n; i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println(n+"prime number between the given range");
		}
		flag=0;
		}
		
		
		
}
	}
