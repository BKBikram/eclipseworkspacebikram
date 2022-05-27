package myproject;
import java.util.*;

public class pallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String st=sc.nextLine();
		boolean pal=st.equals(st);
		if(pal==false)
		{
			System.out.println("it is a pallindrome");
		}
		else
		{
			System.out.println("it is not a pallindrome");
		}
		
	}

}
