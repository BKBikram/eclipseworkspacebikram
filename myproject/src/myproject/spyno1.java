package myproject;

import java.util.Scanner;

public class spyno1 {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int rem,sum=0,product=1;
		int n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
		}
		if(sum==product)
			System.out.println("it is a spy no");
		else
			System.out.println("not a spy no");
		
	}

}
