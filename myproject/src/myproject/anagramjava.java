package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class anagramjava {
	public static boolean anagram(char[] ch,char[] ch1)
	{
		int len=ch.length;
		int len1=ch1.length;
		if(len!=len1)
			return false;
		Arrays.sort(ch);
		Arrays.sort(ch1);
		for(int i=0;i<len;i++)
			if(ch[i]!=ch1[i])
				return false;
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter two strings");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String st1=sc.nextLine();
		char[] ch=st.toCharArray();
		char[] ch1=st1.toCharArray();
		if(anagram(ch,ch1))
			System.out.println("it is an anagram");
		else
			System.out.println("it is not an anagram");
		
	}

}
