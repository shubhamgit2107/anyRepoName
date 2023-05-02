package Array;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		int [] a= {1,5,8,1,9,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++)
		{
		set.add(a[i]);	
		}
		for (Integer inte : set)
		{

		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			if(inte==a[i])
			{
		count++;
			}
		}
		
		if(count>0)
		{
			System.out.println(inte+ "is repeating"+count+"times");
		}
		}
		
		

}
}
	


