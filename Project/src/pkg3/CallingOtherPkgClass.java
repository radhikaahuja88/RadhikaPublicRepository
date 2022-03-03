package pkg3;

import pkg4.Add;

public class CallingOtherPkgClass

{
	public void Subtract(int x ,int y)
	{
		int z=x-y;
		System.out.println("Subtract is "+z);
	}
	public static void main(String[] args)
	{
		Add obj=new Add();
		obj.addition(4, 5);
		CallingOtherPkgClass abc = new CallingOtherPkgClass();
		abc.Subtract(99, 21);
	}

}
