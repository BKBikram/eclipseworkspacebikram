package myproject;
import java.util.Scanner;

public class countspecialchar {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int nonspe=0,specl=0;
		System.out.println("Enter your email-id");
		String st=sc.nextLine();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z' || ch>='0' && ch<='9')
			{
				nonspe++;
			}
			else
			{
				specl++;
			}
		}
		System.out.println("The no of special characters are"+specl);
	}

}
