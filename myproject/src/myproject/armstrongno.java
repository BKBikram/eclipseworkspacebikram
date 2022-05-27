package myproject;

import java.util.Scanner;

public class armstrongno {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int no,rem,temp,ctr=0;
		double sum=0;
		no=sc.nextInt();
		temp=no;
		while(no!=0)
		{
			ctr++;
			no=no/10;
		}
		no=temp;
		while(no!=0)
		{
			rem=no%10;
			sum=sum+(Math.pow(rem,ctr));
			no=no/10;
		}
		if(sum==temp)
		System.out.println("armstrong no:");
		else
			System.out.println("not armstrong no");
	}

}
