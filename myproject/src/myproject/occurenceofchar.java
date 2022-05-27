package myproject;

import java.util.Scanner;

public class occurenceofchar {
	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		System.out.println("ENter a character for occurence:");
		char s=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch==s)
				count++;
		}
		System.out.println("The occurence of "+s+" is"+count);
		
	}

}
