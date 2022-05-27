package myproject;

import java.util.Scanner;

public class fib {
	public static void main(String[] args) {
		System.out.print("Enter the term for fibonacci series");
		Scanner sc=new Scanner(System.in);
		int a=1,b=2,c,term;
		term=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=3;i<=term;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
