package ArrayPractice;

public class FirstMinimumWithoutBubblesort {

	public static void main(String[] args)
	{
		int[] a= {5,9,8,1};
		int fmin=a[0];
		for (int i = 0; i < a.length; i++)
		{
		if(fmin>a[i])
		{
		fmin=a[i];	
			
		}
		}
		
		System.out.println(fmin+" firstminimum"); 

	}

}
