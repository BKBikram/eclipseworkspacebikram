package myproject;

import java.util.Scanner;

public class primeornot {
	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=2;
		while(d<n)
		{
			if(n%d==0)
			break;
			d=d+1;
		}
		if(n==d)
			System.out.println("prime no");
		else
			System.out.println("not prime no");
	}

}
