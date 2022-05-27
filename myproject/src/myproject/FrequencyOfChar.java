package myproject;

import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line");
		String line=sc.nextLine();
		System.out.println("Enter the character which you want to remove:");
		char ch1=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if(ch==ch1)
				count++;
		}
		System.out.println(count);
		
	}

}
