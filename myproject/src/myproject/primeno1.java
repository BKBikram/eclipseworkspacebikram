package myproject;

import java.util.Scanner;

public class primeno1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		int d=2;
		while(d<n)
		{
			if(n%d==0)
				break;
			   d=d+1;
		}
		if(d==n)
		System.out.println("prime NO");
		else
			System.out.println("it is not a prime NO");
	}

}
