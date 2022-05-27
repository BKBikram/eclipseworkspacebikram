package myproject;

import java.util.Scanner;

public class countword {
	public static void main(String[] args) {
		System.out.println("Enter a line:");
		Scanner sc=new Scanner(System.in);
		int count=1;
		String st=sc.nextLine();
		int len=st.length();
		for(int i=0;i<len;i++)
		{
			char ch=st.charAt(i);
			   if(ch==' ')
			   {
				count++;   
			   }
		}
		System.out.println(count);
	}

}
