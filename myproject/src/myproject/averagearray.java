package myproject;
import java.util.Scanner;

public class averagearray {
	static float avg() {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to avg");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		float avrg=(float)sum/n;
		return avrg;
	}
	public static void main(String[] args) {
		float r=avg();
		System.out.println("The average is :"+r);
	}

}
