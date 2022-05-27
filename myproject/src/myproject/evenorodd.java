package myproject;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		if(no%2==0)
			System.out.println("The given no is even");
		else
			System.out.println("Given no is odd");
	}

}
