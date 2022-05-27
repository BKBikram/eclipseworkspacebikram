package myproject;

import java.util.Scanner;

public class method {
	
	public static void main(String[]args)
	{
		//wap to create a method to accept two integer and display them by swapping thier values
		Scanner sc=new Scanner(System.in);
		method mt=new method();
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+" "+b);
		//swap(a,b);
		mt.swap(a, b);
		
	}
	public void swap(int a,int b)
	{
		int c;
		c=a;
		a=b;
	    b=c;
	    System.out.println(a+" "+b);
	}

}
