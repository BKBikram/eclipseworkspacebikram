package myproject;

import java.util.Scanner;

public class swapno {
	public static void main(String[] args) {
		System.out.println("Enter two no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.println("After swapping");
		n=n+n1;
		n1=n-n1;
		n=n-n1;
		System.out.println(n+" "+n1);
		
	}

}
