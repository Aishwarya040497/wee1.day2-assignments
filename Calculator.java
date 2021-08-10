package week1.day2.assignments;

public class Calculator {		

    int sum ;
	int num1=2;
	int num2=3;
	int num3=4;
	int sub;
	double mul;
	double num4=2.1;
	double num5=3.1;
	float div;
	float num6=4.5f;
	float  num7=1.2f;

	public int add()
	
	{
		int sum= num1 + num2 + num3;
		System.out.println("Sum of numbers is: "+sum);		
		return sum;
	}
	
	public int sub()
	{
		int sub=num1 - num2;
		System.out.println("Difference of numbers is: " +sub);
		return sub;
	}
	
	public double mul()
	{
		double mul= num4 * num5;
		System.out.println("Product of numbers are: " +mul);
		return  mul;
		
	}
	public float div()
	{
		float div=num6/num7;
	System.out.println("Division of numbers is: " +div );
		return div;

	}
	}