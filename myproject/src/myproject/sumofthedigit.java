package myproject;

import java.util.Scanner;

public class sumofthedigit {
	public static void main(String[] args) {
		System.out.println("Enter  a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,sum=0,temp;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
			System.out.println(sum);	
	}
}
