package myproject;

import java.util.Scanner;

public class primej {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int no,d=2;
		no=sc.nextInt();
		while(d<no)
		{
			if(no%d==0)
				break;
			    d=d+1;
			
		}
		if(d==no)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
