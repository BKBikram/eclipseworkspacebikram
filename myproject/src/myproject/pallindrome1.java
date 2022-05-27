package myproject;

import java.util.Scanner;

public class pallindrome1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String rev="";
		System.out.println("Enter a string");
		String st=sc.nextLine();
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		if(st.equals(rev))
		{
			System.out.println("it is pallindrome");
		}
		else
			System.out.println("it is not pallindrome");
	}

}
