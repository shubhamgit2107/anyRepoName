package ArrayPractice;

public class firstMinimumAndSecondMinimum {

	public static void main(String[] args) {
	int[] a= {2,8,6,11,3,4};
	int fmin=a[0];
	int smin=a[0];
	for (int i = 0; i < a.length; i++) 
	{
		if(fmin>=a[i])
		{
			if(a[i]!=fmin)
			{
				smin=fmin;
			}
			fmin=a[i];
		}
		else if(fmin==smin || a[i]<smin)
		{
			smin=a[i];
		}
		
	}
	System.out.println(fmin);
		
System.out.println(smin);  
	}

}
