package Array;

public class SumOfthreeLargestNumberInarray {

	public static void main(String[] args) {
		int a[]= {12,65,74,34,98};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of three largetnumber ==>" +sum);

	}

}
