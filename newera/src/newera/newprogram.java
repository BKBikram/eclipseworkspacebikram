package newera;

import java.util.Scanner;

public class newprogram {

	public static void main(String[] args) {
		//// TODO Auto-generated method stub
		// Write a program that accepts three numbers from the user and prints 
		//"increasing" if the numbers are in increasing order, "
		//decreasing" if the numbers are in decreasing order, and "
				//+ ""Neither increasing or decreasing order" otherwise.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c)
			System.out.println("increasing");
		else if(a>b && b>c)
			System.out.println("decreasing");
		else if(a==b && b==c)
			System.out.println("inputs are same");
		else
			System.out.println("Random inputs");
		
		

	}

}
