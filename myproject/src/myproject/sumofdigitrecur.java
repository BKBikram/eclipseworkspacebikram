package myproject;

import java.util.Scanner;

public class sumofdigitrecur {
	public static int sumofdigit(int n) {
		if(n==0)
			return 0;
		return(n%10+sumofdigit(n/10));
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sumofdigit(n);
		System.out.println(r);
	}

}
