package myproject;

import java.util.Scanner;

public class perfectn {
	public static void main(String[] args) {
		System.out.println("Enter a no ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		if(n==sum)
			System.out.println("perfect no");
		else
			System.out.println("not perfect");
	}

}
