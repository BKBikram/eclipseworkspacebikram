package myproject;

import java.util.Scanner;

public class occurancechar {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int count=0;
		System.out.println("Enter the character which u want to know the occurance");
		char st1=sc.next().charAt(0);
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch==st1)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
