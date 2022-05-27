package myproject;

import java.util.Scanner;

public class countspec {
	public static void main(String[] args) {
		System.out.println("Enter your email id");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int nonsp=0,sp=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z' || ch>='0' && ch<='9')
			{
				nonsp++;
			}
			else
				sp++;
		}
		System.out.println(sp);
	}

}
