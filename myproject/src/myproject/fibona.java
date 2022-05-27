package myproject;

import java.util.Scanner;

public class fibona {
	static int a=0,b=1,c;
	public static void fib(int n) {
		if(n>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			fib(n-1);
		}
		
	}
	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println("Enter the term for fibonacci series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(a+" "+b);
		fib(n-2);
	}

}
