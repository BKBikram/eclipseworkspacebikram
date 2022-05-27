package myproject;

import java.util.Scanner;

public class removegivenchar {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter the character which you want to remove:");
		String s1=sc.next();
		String newst=s.replace(s1, "");
		System.out.println(newst);
		
		
	}

}
