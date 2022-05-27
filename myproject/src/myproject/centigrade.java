package myproject;
import java.util.Scanner;
public class centigrade {
	public static void main(String[] args) {
		System.out.println("Enter the room temp in centigrade:");
		Scanner sc=new Scanner(System.in);
		double c=sc.nextDouble();
		double f=(c*9/5)+32;
		System.out.println(f);
		}

}
