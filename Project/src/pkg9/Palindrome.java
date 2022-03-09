package pkg9;

import java.util.Scanner;

//Palindrome program
public class Palindrome 
{
	public static void palin(int num)
	{
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Palindrome Program");//121-->121(Palindrome), 123-->321Not Palindrome
		System.out.println("Enter value to be checked");
		Scanner s = new Scanner(System.in);
		int p=s.nextInt();
		Palindrome.palin(p);
		
	}
}
