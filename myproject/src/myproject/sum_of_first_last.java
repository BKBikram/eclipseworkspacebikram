package myproject;

import java.util.Scanner;

public class sum_of_first_last {
	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int no,rem=0,rev=0;
		
		no=sc.nextInt();
		int last_digit=no%10;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		int first_digit=rev%10;
		int sum=first_digit+last_digit;
		System.out.println(sum);
	}

}
