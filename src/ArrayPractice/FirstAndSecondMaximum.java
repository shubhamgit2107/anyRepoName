package ArrayPractice;

public class FirstAndSecondMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,6,5,7,8,1};
int fmax=a[0];
int smax=a[0];

for (int i = 0; i < a.length; i++)
{
	if(fmax<a[i])
	{
		if(a[i]!=fmax)
		{
			smax=fmax;
		}
		fmax=a[i];
	}
	else if(fmax==smax || smax<a[i])
	{
		smax=a[i];
	}
	
}

System.out.println(" first maximum in array "+fmax);
System.out.println(" Second maximum in array "+smax);
	}

}
