package myproject;

import java.util.Scanner;

public class pallindrome12 {
	public static int pallin(int no) {
		if(no==0)
			return 0;
		return(no%10+pallin(no/10));
	}
	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int r=pallin(no);
		System.out.println(r);
	}

}
