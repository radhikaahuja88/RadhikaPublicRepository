package pkg8;

public class OverridingChild extends OverridingParent
{
	 public void arithmetic(int a , int b)
	   {
		   int c =a/b;
		   System.out.println("Output is "+c);
	   }
public static void main(String[] args) 
{
	OverridingChild abc= new OverridingChild();
	abc.arithmetic(220, 10);
	
}


}
