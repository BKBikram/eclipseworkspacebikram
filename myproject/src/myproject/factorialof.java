package myproject;

import java.util.Scanner;

public class factorialof {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
