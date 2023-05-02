package Array;

public class MultipleOfSmallThreeNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {2,3,7,5,9};
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
int mul=1;
for(int i=0;i<3;i++)
{
	mul=mul*a[i];
}
System.out.println("multiple of largest three number==> "+mul);
	}

}
