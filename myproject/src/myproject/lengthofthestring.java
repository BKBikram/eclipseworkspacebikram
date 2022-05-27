package myproject;
import java.util.Scanner;

public class lengthofthestring {
	static int stringlen() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line:");
		String st=sc.nextLine();
		int len=st.length();
		return len;
	}
	public static void main(String[] args) {
		int r=stringlen();
		System.out.println("The length of the string is :"+r);
		
	}

}
