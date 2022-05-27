package myproject;
import java.util.Scanner;

public class sumofthisdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int no,rem,sum=0;
		no=sc.nextInt();
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("The sum of given no is"+ sum);
	}

}
