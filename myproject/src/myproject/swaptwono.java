package myproject;

import java.util.Scanner;

public class swaptwono {
	public static void main(String[] args) {
		System.out.println("Enter two no:");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("you have entered "+n1+" "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swaping "+n1+" "+n2);
		
	}

}
