package myproject;

import java.util.Scanner;

public class occuranceofacharacter {
	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		int count=0;
		String st=sc.nextLine();
		System.out.println("Enter the character which u want to know the occurance");
		char ch[]=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			
			char c=st.charAt(i);
			if(c==ch[i])
			{
			System.out.println(c+"="+i);	
			}
		}
		//System.out.println(s+" occurance is ="+count);
		
		
	}

}
