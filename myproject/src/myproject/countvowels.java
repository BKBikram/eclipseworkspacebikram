package myproject;
import java.util.Scanner;
public class countvowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int c=0;
		System.out.println("Enter a line:");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e'||ch== 'i'|| ch=='o'||ch=='u'|| ch=='A' || ch=='E'||ch== 'I'|| ch=='O'||ch=='U')
			{
				c++;
			}
				
		}
		System.out.println("The no of vowel is "+c);
	}

}
