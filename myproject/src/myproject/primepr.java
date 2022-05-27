package myproject;

import java.util.Scanner;

public class primepr {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n,d=2;
		n=sc.nextInt();
		while(d<n)
		{
			if(n%d==0)
			break;
			d=d+1;
		}
		if(d==n)
		{
			System.out.println("prime no");
		}
		else
			System.out.println("not prime");
	}

}
