package myproject;

import java.util.Scanner;

public class pallindromenoor {
	public static void main(String[] args) {
		System.out.println("Enter a no ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp,rem=0,rev=0;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
	}

}
