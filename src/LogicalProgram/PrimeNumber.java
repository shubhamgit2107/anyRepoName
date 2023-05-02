package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		for(;;)
		{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		for (int i = 2; i <=n; i++)
		{
		if(n%i==0)
		{
	count++;
		}
		}
		if(count==1)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is  not prime"); 
		}
		

	}

}
}
