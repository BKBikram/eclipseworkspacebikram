package myproject;

import java.util.Scanner;

public class sum_of_digit_recurssion {
	static int pallin(int n) {
		if(n==0)
			return 0;
		return(n%10+pallin(n/10));
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=pallin(n);
		System.out.println(r);
		if(r==n)
			System.out.println("pallin");
		else
			System.out.println("not pallin");
		
	}

}
