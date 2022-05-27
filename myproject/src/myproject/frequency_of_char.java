package myproject;

import java.util.Scanner;

public class frequency_of_char {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String st=sc.nextLine();
		int[] arr=new int[127];
		for(int i=0;i<st.length();i++)
		{
			arr[st.charAt(i)]=arr[st.charAt(i)]+1;
		}
		int max=-1;
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(ch[i]==1)
			System.out.println(ch[i]+" "+arr[st.charAt(i)]);
		}
		
	}

}
