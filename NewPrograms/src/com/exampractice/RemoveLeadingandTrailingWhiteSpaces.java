package com.exampractice;

import java.util.Scanner;

public class RemoveLeadingandTrailingWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line");
		String st=sc.nextLine();
		//String nl=st.strip();
		String nl1=st.trim();
		System.out.println(nl1);
	}

}
