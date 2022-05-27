package myproject;

import java.util.Scanner;

public class sum_of_digit {
	public static int sumof(int no) {
		if(no==0)
			return 0;
		return (no%10+sumof(no/10)); 
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sumof(n);
		System.out.println(r);
	}

}
