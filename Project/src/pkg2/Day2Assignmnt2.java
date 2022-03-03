package pkg2;
//Program for ((((10*2)-2)*2)+2)/2
public class Day2Assignmnt2 {

	public int mult(int m1,int m2)
	{
		int m3=m1*m2;
	    return m3;
	}
	public int sub(int s1, int s2)
	{
		int s3=s1-s2;
		return s3;
	}
	public int add(int a1, int a2)
	{
		int a3=a1+a2;
		return a3;
	}
	public void div(int d1, int d2)
	{
		int d3=d1/d2;
		System.out.println("Final Result is "+d3);
	}
	
	public static void main(String[] args) 
	{
		Day2Assignmnt2 obj=new Day2Assignmnt2();
		System.out.println("Program for ((((10*2)-2)*2)+2)/2");
		int multiply=obj.mult(10,2);
		System.out.println("Result for first multiply is "+multiply);
		int subtract=obj.sub(multiply,2);
		System.out.println("Result till second brackets is "+subtract);
		int product=obj.mult(subtract,2);
		System.out.println("Result till third brackets is "+product);
		int addition=obj.add(product, 2);
		System.out.println("Result till fourth brackets is "+addition);
		obj.div(addition,2);
	}
}
