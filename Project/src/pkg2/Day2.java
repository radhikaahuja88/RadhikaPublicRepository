package pkg2;

//Program for(10+2)*(10-2)
public class Day2 {

	public int sum(int a, int b)
	{
		int c =a+b;
		System.out.println("Sum is " + c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z =x-y;
		System.out.println("Diff is " + z);
		return z;
	}
	public void multi(int p, int q)
	{
		int m=p*q;
		System.out.println("Multiplication is " + m);
	}
	
	public static void main(String[] args) {
		Day2 obj=new Day2();
		int sumresult=obj.sum(12,2);
		System.out.println("Sum is" + sumresult);
		int subtraction=obj.sub(12,2);
		System.out.println("Difference" + subtraction);
		obj.multi(sumresult, subtraction);
	}
}
