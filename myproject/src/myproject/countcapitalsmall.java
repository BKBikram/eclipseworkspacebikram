package myproject;
import java.util.Scanner;

public class countcapitalsmall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cap = 0,small = 0;
		System.out.println("Enter a sentence");
		String st=sc.nextLine();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				cap++;
			}
			else
			{
				small++;
			}
		}
		System.out.println("no of capital no is "+cap+" and no of small letter is "+small);
	}

}
