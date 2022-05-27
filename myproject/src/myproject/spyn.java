package myproject;

import java.util.Scanner;

public class spyn {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,sum=0,mul=1;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			mul=mul*rem;
			n=n/10;
		}
		if(sum==mul)
			System.out.println("spy no");
		else
			System.out.println("not a spy no");
	}

}
