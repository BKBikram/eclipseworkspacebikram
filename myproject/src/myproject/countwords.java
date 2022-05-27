package myproject;
import java.util.Scanner;

public class countwords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line:");
		String st=sc.nextLine();
		int sp=1;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			{
				if(ch==' ')
				{
					sp++;
				}
			}
		}
		System.out.println("The no of words are "+sp);
		
	}

}
