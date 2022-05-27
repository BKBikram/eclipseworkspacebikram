package myproject;

import java.util.Scanner;

public class prime2 {
	public static void main(String[] args) {
		System.out.println("Enter a no to chk prime or not");
		Scanner sc=new Scanner(System.in);
		int d=2;
		int n=sc.nextInt();
		while(d<n)
		{
			if(n%d==0)
				break;
			d=d+1;
		}
		if(d==n)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
			
}
