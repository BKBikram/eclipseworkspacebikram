package myproject;

import java.util.Scanner;

public class stringlength {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String st=sc.nextLine();
		int len=st.length();
		System.out.println("string length is" +len);
	}

}
