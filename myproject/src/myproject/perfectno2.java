package myproject;

import java.util.Scanner;

public class perfectno2 {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		System.out.println(sum);
		if(sum==n)
			System.out.println("perfect no");
		else
			System.out.println("nor perfect");
	}

}
