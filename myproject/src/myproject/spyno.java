package myproject;

import java.util.Scanner;

public class spyno {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,rev=0,temp,sum=0,mul=1;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			rev=rev*10+rem;
			mul=mul*rem;
			n=n/10;
		}
		System.out.println("reverse is "+ rev);
		if(sum==mul)
			System.out.println(temp+" is spy no");
		else
			System.out.println("not spy");
		
	}

}
