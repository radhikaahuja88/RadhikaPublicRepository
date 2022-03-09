package pkg9;

import java.util.Scanner;

public class Prime {
	
		 public static void main(String args[]){  
			 System.out.println("Enter number to be checked for prime");
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
		  int i,m=0,flag=0;    
		  //it is the number to be checked  
		     
		  if(n==0||n==1){
		   System.out.println(n+" is not prime number");    
		  }
		  else{
		   for(i=2;i<=n/2;i++){    
		    if(n%i==0){    
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  
		   { 
			   System.out.println(n+" is prime number"); }
		  }//end of else
		}  
		} 



