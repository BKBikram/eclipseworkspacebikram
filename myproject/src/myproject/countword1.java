package myproject;

import java.util.Scanner;

public class countword1 {
	public static void main(String[] args) {
		System.out.println("Enter a line");
		Scanner sc=new Scanner(System.in);
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
