package myproject;

import java.util.Scanner;

public class reverseno3 {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n,rev=0,rem;
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
