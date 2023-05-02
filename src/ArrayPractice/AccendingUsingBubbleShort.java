package ArrayPractice;

public class AccendingUsingBubbleShort {

	public static void main(String[] args) 
	{
		int []a= {6,8,2,4,3,9};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
			if(a[i]<a[j])//for sorting in accendingOrder
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			} 
			
		}
		int mul=1;
		for (int i = 0; i <3; i++)
		{
		mul=mul*a[i];	
		}
		System.out.println(mul);
		
		//int sum=0;
		//for (int i = 0; i <3; i++)
	//	{
	//		sum=sum+a[i];
	//	}
	//	System.out.println(sum);
		
	}

}
