package myproject;

import java.util.Scanner;

public class armstrongpr {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		double sum=0;
		int n,rem,temp,ctr=0;
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			ctr++;
			n=n/10;
		}
		n=temp;
		while(n!=0)
		{
		  rem=n%10;
		  sum=sum+(Math.pow(rem, ctr));
		  n=n/10;
		}
		if(temp==sum)
			System.out.println("armstrong no");
		else
			System.out.println("not armstrong");
	}

}
