package myproject;

import java.util.Scanner;

public class sumofdigits1 {
	
	public static int sumdigit(int n) {
		if(n==0) 
			return 0;
		return(n%10+sumdigit(n/10));
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int r=sumdigit(no);
		System.out.println(sumdigit(no));
	}

}
