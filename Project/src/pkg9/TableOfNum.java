package pkg9;

import java.util.Scanner;

public class TableOfNum 
{
public static void main(String[] args) 
{
	System.out.println("Print the Table of a number");
	System.out.println("Enter the number to print the table");
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	for (int i=1; i<=10;i++)
	{
		System.out.println(t+ "*" +i+ "=" +t*i);
	}
		
}
}
