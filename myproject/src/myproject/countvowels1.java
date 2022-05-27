package myproject;

import java.util.Scanner;

public class countvowels1 {
	public static void main(String[] args) {
		System.out.println("Enter a line");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int vowel = 0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
				vowel++;
				
		}
		System.out.println(vowel);
	}
	

}
