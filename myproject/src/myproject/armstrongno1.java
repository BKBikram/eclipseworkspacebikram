package myproject;

import java.util.Scanner;

public class armstrongno1 {
	public static void main(String[] args) {
		System.out.println("Enter a no ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ctr=0,rem=0,temp;
		double sum=0;
		temp=n;
		while(n!=0)
		{
			n=n/10;
			ctr++;
		}
		n=temp;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(Math.pow(rem, ctr));
			n=n/10;
		}
		if(sum==temp)
			System.out.println("armstrong no");
		else
			System.out.println("not armstrong no");
		
		
	}

}
