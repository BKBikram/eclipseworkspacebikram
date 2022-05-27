package myproject;
import java.util.Scanner;
public class reverseno5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n,rev=0,rem;
		n=sc.nextInt();
		while(n!=0);
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse no is");
   
	}

}
