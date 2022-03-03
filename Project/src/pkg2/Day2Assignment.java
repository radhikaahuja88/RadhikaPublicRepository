package pkg2;


//Program for((((10+2)+2)-2)*2)/2
public class Day2Assignment 
{
	public int sum (int a, int b)
	{
	int c=a+b;
	return c;
}
	
	public int sub(int x, int y)
	{
		int z=x-y;
		return z;
	}
	
	public int mul(int p, int q)
	{
		int m= p*q;
		return m;
	}
	
	public void div(int d1, int d2)
	{
		int d3=d1/d2;
		System.out.println("Final result is "+d3);
				
	}
public static void main(String[] args) {
	Day2Assignment obj1=new Day2Assignment();
	System.out.println("Program for((((10+2)+2)-2)*2)/2");
	int sumresult=obj1.sum(10,2);
	System.out.println("First sum result "+sumresult);
	int add=obj1.sum(sumresult, 2);
			System.out.println("2nd sum result "+add);
	int diff = obj1.sub(add, 2);
			System.out.println("Result till diff is "+diff);
	int multiply=obj1.mul(diff,2);
				System.out.println("Result till multiply is "+multiply);
	obj1.div(multiply,2);	
	
}
}