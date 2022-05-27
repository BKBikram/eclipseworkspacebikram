package myproject;

import java.util.Scanner;

public class factorial4 {
	public static void main(String[] args) {
		System.out.println("Enter the no for factorial");
		Scanner sc=new Scanner(System.in);
		int n,fact=1;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	System.out.println(fact);
	}
	

}
