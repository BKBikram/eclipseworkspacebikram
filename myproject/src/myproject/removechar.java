package myproject;

import java.util.Scanner;

public class removechar {
	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter a character which you want to remove");
		String s=sc.next();
		/*for(int i=0;i<name.length();i++)
		{
			char ch1=name.charAt(i);
			if(ch1==ch)
			{
			  name=name.replace(ch1,"");	
			}
		}*/
	   String news=name.replace(s, "");
		System.out.println(news);
	}

}
