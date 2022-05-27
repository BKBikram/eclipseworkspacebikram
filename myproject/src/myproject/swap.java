package myproject;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		System.out.println("Enter two no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int no1=sc.nextInt();
		int c;
		System.out.println("before swapping "+no+" "+no1);
		c=no;
		no=no1;
		no1=c;
		System.out.println("After swapping "+no+" "+no1);
		
	}

}
