package ArrayPractice;



public class Practice {
	
	
	public static void main(String[] args)
	{
	int[] a= {1,10,2,9,3,8,4,7};
	
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < a.length; j++) {
			if(a[i]+a[j]==11)
			{
			System.out.println("the values are "+a[i]+ " "+a[j]);	
			}
			
		}
		
	}
	
		
		
	}

}
