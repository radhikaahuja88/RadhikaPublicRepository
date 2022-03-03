package pkg5;

public class CRV extends Honda
{
	public void cars()
        {
         System.out.println("CRV is also Honda Brand car from Class - CRV");		
          }
	
	public static void main(String[] args)
	{
	
	System.out.println("This is Hierarchical Level Inheritance");
		CRV radhika=new CRV();
		radhika.baseprice();
		radhika.cars();
		
	}

}