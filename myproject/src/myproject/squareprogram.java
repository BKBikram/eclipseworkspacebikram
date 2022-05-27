package myproject;
import java.util.Scanner;
public class squareprogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mul=0;
		System.out.println("printing the square of all digit");
		for(int i=1;i<=10;i++)
		{
			mul=i*i;
			System.out.println(mul);
		}
	}

}
