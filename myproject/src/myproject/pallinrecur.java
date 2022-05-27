package myproject;

import java.util.Scanner;

public class pallinrecur {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,rev=0,temp;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("pallindrome");
		}
		else
			System.out.println("not pallindrome");
		
	}

}
