package Array;

public class FindFirstMinimumWithoutUingBublesortInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {3,5,1,8,5};
		int fmin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(fmin>a[i])
			{
				fmin=a[i];
			}
		}
System.out.println(fmin);
	}

}
