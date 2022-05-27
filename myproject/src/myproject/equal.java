package myproject;

import java.util.Scanner;

public class equal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a==b && b==c && c==d)
		{
			//if(c==d)
				System.out.println("all values are equal ");
		}
		else
			System.out.println("all are not equal");
	}

}
