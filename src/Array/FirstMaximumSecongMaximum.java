package Array;

public class FirstMaximumSecongMaximum {

	public static void main(String[] args) {
		
		 int [] a= {1,3,5,2,8,9,10,7,4,11,0};
		 for (int i = 0; i < a.length; i++) 
		 {
			for (int j = 0; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		 
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(" "+a[i]);
		}
		}
		
}

