package myproject;

import java.util.Scanner;

public class perfectno {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n,factors=0;
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				factors=factors+i;
		}
		if(factors==n)
			System.out.println("perfect no");
		else
			System.out.println("not perfect no");
	}

}
