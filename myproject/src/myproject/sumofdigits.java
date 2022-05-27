package myproject;

import java.util.Scanner;

public class sumofdigits {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int no,sum=0,rem;
		int count=0;
		no=sc.nextInt();
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
