package myproject;
import java.util.Scanner;
public class positiveelement {
	public static void main(String[] args) {
		System.out.println("Enter 10 no");
		Scanner sc=new Scanner(System.in);
	     int i;
		int[] no=new int[10];
		for( i=0;i<10;i++)
		{
			no[i]=sc.nextInt();
		}
		int gr=no[0];
		for( i=0;i<10;i++)
		{
			
			if(no[i]>gr)
			gr=no[i];
		}

		
		System.out.println("positive "+gr);
		//System.out.println("negative"+n);
		
	}

}
