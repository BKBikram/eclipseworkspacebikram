package myproject;

import java.util.Scanner;

public class arnstrongn {
	public static void main(String[] args) {
		System.out.println("Enter a NO");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int temp=no;
		double sum=0;
		int ctr=0,rem;
		while(no!=0)
		{
			no=no/10;
			ctr++;
		}
		no=temp;
		while(no!=0)
		{
		 rem=no%10;
		 sum=sum+(Math.pow(rem, ctr));
		 no=no/10;
		}
		if(sum==temp)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}

}
