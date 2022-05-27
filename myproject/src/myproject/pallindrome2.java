package myproject;
import java.util.Scanner;

public class pallindrome2 {
	public void pallin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
				rev=rev+s.charAt(i);
		}
		System.out.println("reverse string is "+rev);
		//if(s==rev)  not working
		//if(s.contains(rev))   its working
		if(s.equals(rev))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}
	public static void main(String[] args) {
		
		pallindrome2 obj=new pallindrome2();
		obj.pallin();
		
		
	}

}
