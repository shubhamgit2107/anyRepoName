package ArrayPractice;

public class FirstMaximumWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {7,9,3,1,2,9};
		int fmax=a[a.length-1];
		for (int i = 0; i < a.length; i++)
		{
		if(fmax<a[i]) 
		{
		fmax=a[i];	
		}
			
			
		}
		System.out.println(fmax);

	}

}
