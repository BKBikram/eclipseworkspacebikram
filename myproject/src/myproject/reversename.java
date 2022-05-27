package myproject;
import java.util.Scanner;
public class reversename {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
	}

}
