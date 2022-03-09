package pkg9;

import java.util.Scanner;

public class Armstrong
{
public static void main(String[] args)
{   int arm=0;
	System.out.println("Armstrong Program 153=1*1*1 + 5*5*5 +3*3*3");
	System.out.println("Enter the number to be checked");
	Scanner s=new Scanner(System.in);
	int num= s.nextInt();
	int temp=num;
	
	while(num>0)
	{
	int rem=num%10;
	arm=arm+(rem*rem*rem);
	num=num/10;
	}
	
	if(temp==arm)
	{System.out.println(+temp+ " is an armstrong number");
	
	}
	else
	{
		System.out.println(+temp+ " is not an armstrong number");
	}
}
}
