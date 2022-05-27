package myproject;

import java.util.Scanner;

public class pallindromepr {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String st,rev="";
		st=sc.nextLine();
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		if(st.equals(rev))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
				
	}

}
