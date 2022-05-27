package myproject;

import java.util.Scanner;

public class counta {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		int len,count=0;
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		len=st.length();
		// ch=st.charAt(i);
		for(int i=0;i<len;i++)
		{
			char ch=st.charAt(i);
			if(ch=='A' || ch=='a')
				count++;			
		}
		System.out.println(count);
	}
}
