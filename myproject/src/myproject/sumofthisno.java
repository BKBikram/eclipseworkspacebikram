package myproject;
import java.util.Scanner;

public class sumofthisno {
	static int sumdigit(int n) {
		int rem,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		int r=sumdigit(n);
		System.out.println("The sum of this no is:"+r);
	}

}
