package ArrayPractice;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int[] a= {2,5,3,1,7,8};
		int[] b= {2,5,4,3,6};
		int length=a.length;
		if(a.length>b.length)
		{
			length=a.length;
		}
		for (int i = 0; i < b.length; i++) 
		{
		try
		{	
		System.out.println(a[i]+b[i]);	
		}
		catch (Exception e)
		{
		if(a.length>b.length)
		{
			System.out.println(a[i]);
		}
		else
		{
			System.out.println(b[i]);
		}
		}
		}

	}

}
