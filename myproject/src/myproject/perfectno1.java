package myproject;

import java.util.Scanner;

public class perfectno1 {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
			  sum=sum+i;	
			}
		}
		if(sum==no)
		{
			System.out.println("sum is "+sum+" and it is a perfect no");
		}
		else
			System.out.println("not perfect");
	}

}
