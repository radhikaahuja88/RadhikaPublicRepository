package pkg5;

public class Amaze extends Honda
{
	public void model()
	{
		
		System.out.println("This is Honda Amaze from  Class - Amaze");
	}

	public static void main(String[] args) {
		System.out.println("Program for Single Inheritance");
		Amaze car = new Amaze();
		car.model();
		car.baseprice();
	}
	
}
