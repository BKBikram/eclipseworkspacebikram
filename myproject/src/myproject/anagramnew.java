package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class anagramnew {
	static boolean anagram(char[] s,char[] s1) {
		int len=s.length;
		int len1=s1.length;
		if(len!=len1)
			return false;
		Arrays.sort(s);
		Arrays.sort(s1);
		for(int i=0;i<len;i++)
		if(s[i]!=s1[i])
			return false;
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter two string");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String st1=sc.nextLine();
		char[] ch=st.toCharArray();
		char[] ch1=st.toCharArray();
		if(anagram(ch,ch1))
			System.out.println("anagram");
		else
			System.out.println("not anagram");
		
	}

}
