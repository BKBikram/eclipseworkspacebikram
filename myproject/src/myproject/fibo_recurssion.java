package myproject;

import java.util.Scanner;

public class fibo_recurssion {
	static int a=0,b=1,c;
	     public static void fib(int n) {
	    	 if(n>0)
	    	 {
	    		 c=a+b;
	    	 a=b;
	    	 b=c;
	    	 System.out.println(c);
	    	 fib(n-1);
	    	 }
	    	 
	     }
	public static void main(String[] args) {
		System.out.println("enter how many no of fibobacci series do you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.println(a+" "+b);
		fib(n-2);
	}

}
