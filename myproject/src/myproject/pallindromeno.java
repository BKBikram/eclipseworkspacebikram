package myproject;

import java.util.Scanner;

public class pallindromeno {
	public static void main(String[] args) {
		System.out.println("Enter a no to check it is pallindrome or not:");
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0,org;
		n=sc.nextInt();
		org=n;
		while(n!=0)
		{
		rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==org)
		System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
	}

}
