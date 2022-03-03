package pkg8;

import java.util.Scanner;

public class UserEnterInt 
{
public static float sum(float a, float b)
{
	float c= a+b;
	return c;
}

public static float sub(float d1, float d2)
{
	float d3= d1-d2;
	return d3;
}
public static float mult(float m1, float m2)
{
	float m3= m1*m2;
	return m3;
}

public static float divi(float div1, float div2)
{
	float div3= div1/div2;
	return div3;
	
	
}

public static void main(String[] args)
{
	System.out.println("Output for expression((((x1+x2)-x3)+x4)*x5)/x6");
	Scanner abc= new Scanner(System.in);
			System.out.println("Enter value of x1");
			float x1=abc.nextFloat();
			System.out.println("Enter value of x2");
			float x2=abc.nextFloat();
			float sum=UserEnterInt.sum(x1, x2);
			System.out.println("Enter value of x3");
			float x3=abc.nextFloat();
			float minus=UserEnterInt.sub(sum, x3);
			System.out.println("Enter value of x4");
			float x4=abc.nextFloat();
			float sum2=UserEnterInt.sum(minus, x4);
			
			System.out.println("Enter value of x5");
			float x5=abc.nextFloat();
			float multi=UserEnterInt.mult(sum2, x5);
			
			System.out.println("Enter value of x6");
			float x6=abc.nextFloat();
			float division=UserEnterInt.divi(multi, x6);
			System.out.println("Result is "+division);
			
			
			
}
}
