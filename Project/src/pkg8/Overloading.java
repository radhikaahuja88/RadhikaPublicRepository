package pkg8;

public class Overloading
{
	public void multiplication(int a , int b)
	{
		int c=a*b;
		System.out.println("Multiplication of 2 no is "+c);
	}
    public void multiplication(int a , int b, int c)
    {
		int d=a*b*c;
		System.out.println("Multiplication of 3 no is "+d);
	}
    
    public void multiplication(int a , float b, int c)
    {
		float d=a*b*c;
		System.out.println("Multiply of 3 no is "+d);
	}

    public static void main(String[] args) 
    {
    	Overloading over=new Overloading();
    		over.multiplication(2, 3);	
    	    over.multiplication(3,9.2F,2);
    	    
    			
	}
}
