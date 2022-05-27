package myproject;
//wap to enter a string and ask uset to delete a char from the given string and show the string afeter deleting this

import java.util.Scanner;

public class removecharfromstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line");
		String st=sc.nextLine();
		System.out.println("Enter the character which u want to delete:");
		String st1=sc.next();
		String stnew=st.replace(st1, "");
		System.out.println(stnew);
		
	}

}
