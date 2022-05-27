package myproject;

import java.util.Scanner;

public class sumof {
	static int sum_of(int no) {
		if(no==0)
			return 0;
		return(no%10+sum_of(no/10));
			
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
	    int r=sum_of(no);
	    System.out.println(r);
		
	}

}
