package myproject;

import java.util.Scanner;

public class strongno {
	public static void main(String[] args) {
		System.out.println("Enter  a no:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int rem,fac,sum=0,temp;
		temp=no;
		while(no!=0)
		{
			fac=1;
			rem=no%10;
			for(int i=1;i<=rem;i++)
			fac=fac*i;
			sum=sum+fac;
			no=no/10;	
		}
		System.out.println(sum);
		if(sum==temp)
			System.out.println("strong");
		else
			System.out.println("not strong no");
	}

}
