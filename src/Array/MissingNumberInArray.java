package Array;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args)
	{
		int[] a= {6,2,5,7};
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for (int i = 0; i <=n; i++)
		{
			set.add(i);
		}
		for (int i = 0; i < a.length; i++)
		{
		set.remove(a[i]);
		
		}
		System.out.println(set);

	}
	

}
