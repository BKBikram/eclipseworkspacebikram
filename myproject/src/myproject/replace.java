package myproject;
import java.util.Scanner;

public class replace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you name");
		String st=sc.nextLine();
		/*for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z')
			{
				st.toUpperCase();
			}
				
		}*/
		System.out.println(st.toUpperCase());
	}

}
