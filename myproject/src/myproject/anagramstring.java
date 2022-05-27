package myproject;

import java.util.Arrays;

import java.util.Scanner;

public class anagramstring {
	static  boolean anagram(char[] st,char[] st1) {
		int len=st.length;
		int len1=st1.length;
		if(len!=len1)
		return false;
		Arrays.sort(st);
		System.out.println(st);
		Arrays.sort(st1);
		for(int i=0;i<len;i++)
			if(st[i]!=st1[i])
				return false;
			
		
			return true;
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter two string :");
		Scanner sc=new Scanner(System.in);
		String st,st1;
		st=sc.nextLine();
		st1=sc.nextLine();
		char[] ch=st.toCharArray();
		char[] ch1=st1.toCharArray();
		if(anagram(ch,ch1))
				System.out.println("is anagram");
		else
			System.out.println("not anagram");
		
				
	}

}
