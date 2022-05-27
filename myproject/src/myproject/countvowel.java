package myproject;

import java.util.Scanner;

public class countvowel {
	public static int stringchallenge(String s) {
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e'||ch== 'i'|| ch=='o'||ch=='u'|| ch=='A' || ch=='E'||ch== 'I'|| ch=='O'||ch=='U')
			{
				c++;
			}
				
		}
		return c;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	System.out.println("Enter a line:");
	System.out.print(stringchallenge(s=sc.nextLine()));
	
}

}
