package myproject;
import java.util.Scanner;

public class countevenint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,even=0,odd=0;
		System.out.println("Enter 15 no:");
		for(int i=0;i<15;i++)
		{
			no=sc.nextInt();
			if(no%2==0)
			{
				even=even+1;
			}
			else
			{
				odd=odd+1;
			}
		}
		System.out.println("The no of even integer is "+even+"and the no of odd no id "+odd);
	}

}
