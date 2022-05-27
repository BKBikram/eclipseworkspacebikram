package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class  example1 {
	static boolean anagram(char ch[],char ch1[])
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s=sc.nextLine();
		System.out.println("Enter 2nd string");
		String s1=sc.nextLine();
		char[] ch=s.toCharArray();
		char[] ch1=s1.toCharArray();
		if(anagram(ch,ch1))
			System.out.println("two strings are anagram");
		else
			System.out.println("two strings are not anagram");
			
		
	}

}
