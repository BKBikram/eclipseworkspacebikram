package myproject;

import java.util.Scanner;

public class removechar1 {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		System.out.println("Enter the character which u want to remove");
		String s=sc.next();
		String newst=st.replace(s, "");
		System.out.println(newst);
	}

}
