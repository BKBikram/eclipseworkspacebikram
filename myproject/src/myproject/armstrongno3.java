package myproject;

import java.util.Scanner;

public class armstrongno3 {
	public static void main(String[] args) {
		System.out.println("Enter a no to check wheather the no is armstrong or not");
		Scanner sc=new Scanner(System.in);
		int ctr=0,temp,rem=0;
		double sum=0;
		int n=sc.nextInt();
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
