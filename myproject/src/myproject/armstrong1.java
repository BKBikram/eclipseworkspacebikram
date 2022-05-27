package myproject;

import java.util.Scanner;

public class armstrong1 {
	public static void  main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n,org,rem=0,sum=0;
		n=sc.nextInt();
		org=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
	   if(org==sum)
		   System.out.println("armstrong no");
	   else
		   System.out.println("not a armstrong no");
	}

}
