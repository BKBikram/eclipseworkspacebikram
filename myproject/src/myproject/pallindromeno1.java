package myproject;

import java.util.Scanner;

public class pallindromeno1 {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,rev=0,temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println("no is pallindrome");
		else
			System.out.println("no is not a pallindrome");
	}

}
