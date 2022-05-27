package myproject;

import java.util.Scanner;

public class count_alphaber_small_cap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String st=sc.nextLine();
		int small=0,cap=0;
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(ch[i]>=65 && ch[i]<=92 )
			{
				cap=cap+1;
			}
			else if (ch[i]>=97 && ch[i]<=122)
			{
				small++;
			}
		}
		System.out.println("captal letter="+cap);
		System.out.println("small letter="+small);
	}

}
