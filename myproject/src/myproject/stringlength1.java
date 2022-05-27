package myproject;

import java.util.Scanner;

public class stringlength1 {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int len=st.length();
		System.out.println("The length of the string is:"+len);
	}

}
