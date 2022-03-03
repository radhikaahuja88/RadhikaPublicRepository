package pkg6;

import pkg5.Amaze;

public class AmazePetrol extends Amaze
{
private void petrol()
{
	
	System.out.println("This is Honda Amaze Petrol version from  Class-Amaze Petrol");

}

public static void main(String[] args)
{
	System.out.println("This program is for Multi Level Inheritance");
	AmazePetrol object = new AmazePetrol();
	object.petrol();
	object.model();
	object.baseprice();
	
	

	
}


}
