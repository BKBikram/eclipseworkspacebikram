package newera;

import java.util.Scanner;

public class bikramfirst {
	public static void main(String[] args) {
		//write a program to count word given by user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=sc.nextLine();
		int count=1;
		for(int i=0;i<st.length();i++)
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
