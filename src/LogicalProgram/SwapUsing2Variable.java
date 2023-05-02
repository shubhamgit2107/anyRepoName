package LogicalProgram;

public class SwapUsing2Variable {

	public static void main(String[] args) 
	{
	int a=10;
	int b=20;
	b=b+a;
	a=b-a;
	b=b-a;
	System.out.println(a+" value of a");
	System.out.println(b+"value of b");

	}

}
