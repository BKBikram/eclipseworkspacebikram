package myproject;
import java.util.*;

public class prime {
	     public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
	     int n,d=2;
	     System.out.println("Enter a number:");
	     n=sc.nextInt();
	      while(d<n)
	       {
	       if(n%d==0)
	      
	        break;
	        d++;
		    
		   }
		   if(d==n)
			   System.out.println("it is prime");
			else
			System.out.println("It is not prime:");
		}
	}
			
	     
