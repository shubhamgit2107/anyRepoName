package Array;

public class FindFirstMaximumWithoutUsingBubleSort {

	public static void main(String[] args) {
		int []a= {34,65,12,32,9};
		int fmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
			}
		}
System.out.println(fmax);
	}

}
