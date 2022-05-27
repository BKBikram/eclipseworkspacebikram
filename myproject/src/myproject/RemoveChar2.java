package myproject;

import java.util.Scanner;

public class RemoveChar2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line");
		String line=sc.nextLine();
		System.out.println("Enter the char which you want to remove");
		char c=sc.next().charAt(0);
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if(ch==c)
				continue;
			System.out.print(ch);
		}

	}

}
