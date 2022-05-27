package com.exampractice;

import java.util.Scanner;

public class ArmstrongNoOrNot {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a No to check that is armstrong no or not");
	    int n=sc.nextInt();
	    int org=n,rem=0,ctr=0,sum=0;
	    while(n!=0)
	    {
	    	ctr++;
	    n=n/10;	
	    }
	    n=org;
	    while(n!=0)
	    {
	    	rem=n%10;
	    	sum=sum+(int)Math.pow(rem, ctr);
	    	n=n/10;
	    }
	    if(org==sum)
	    	System.out.println("armstrong no");
	    else
	    	System.out.println("not armstrong no");

	}

}
