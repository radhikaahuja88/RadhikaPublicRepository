package pkg8;

public class ExplicitandImplicit 
{
public void implicit(char a)
{
	int b=a;
	System.out.println("Output of implicit call(Char to int) is "+ b);
	float d=a;
	System.out.println("Output of implicit call(Char to Float) is "+ d);
}

public void explicit(float b)
{
	int c=(int)b;
	System.out.println("Output of explicit call(Float to int) is "+ c);
	char d=(char)b;
	System.out.println("Output of explicit call(Float to Char) is "+ d);
}

public static void main(String[] args)
{
	ExplicitandImplicit obj= new ExplicitandImplicit();
	obj.implicit('M');
	obj.explicit(98.65F);
}
}
