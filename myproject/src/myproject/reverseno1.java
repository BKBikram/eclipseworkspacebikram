package myproject;

import java.util.Scanner;

public class reverseno1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,rem;
		System.out.println("enter a number you want to reverse:");
		int num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

}
