package Array;

public class MethodOverLoading {


		
		 int add(int a,int b)
		{
			return(a+b);
		}
		 int add(int a,int b,int c)
			{
				return(a+b+c);
			}
		 double add(double a,int b,int c)
			{
				return(a+b+c);
			}
		 public static void main(String[] args) {
			MethodOverLoading m= new MethodOverLoading();
			System.out.println(m.add(12, 13));
		}
			

}
