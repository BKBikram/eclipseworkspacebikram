package myproject;

import java.util.Scanner;

public class booklibrary {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String st=sc.nextLine();
	     st=st.replace('a', '*');
			
		
		//System.out.println(st.replace('a', '*'));
	     System.out.println(st);
	}

}
