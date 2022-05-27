package myproject;

import java.util.Scanner;

public class fiboo {
	public static void main(String[] args) {
		System.out.println("enter the term for fibonacci series:");
		Scanner sc=new Scanner(System.in);
		int term=sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a+""+b);
		for(int i=2;i<term;i++)
		{
		 	c=a+b;
		 	System.out.println(" "+c);
		 	a=b;
		 	b=c;
		}
	}

}

