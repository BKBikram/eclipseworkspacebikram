package myproject;

import java.util.Scanner;

public class fibnoseries {
	public static void main(String[] args) {
		System.out.println("Enter the term for fibonacci series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
