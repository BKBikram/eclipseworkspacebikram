package myproject;

import java.util.Scanner;

public class occuranceo {
	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		System.out.println("Enter the character for occurance");
		char c=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==c)
			{
				count=count+1;
			}	
		}
		System.out.println(count);
	}

}
