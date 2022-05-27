package myproject;

import java.util.Scanner;

public class reverseno4 {
	public static void main(String[] args) {
	     System.out.println("Enter a no:");
	     int n,rev=0,rem;
	     Scanner sc=new Scanner(System.in);
	     n=sc.nextInt();
	     while(n!=0)
	     {
	    	 rem=n%10;
	    	 rev=rev*10+rem;
	    	 n=n/10;
	     }
	     System.out.println(rev);
	}

}
