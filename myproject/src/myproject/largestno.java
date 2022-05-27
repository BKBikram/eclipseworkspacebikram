package myproject;
//largest no among 3 no
import java.util.*;
public class largestno {
	public static void main(String[] args) {
		System.out.println("Enter 4 no:");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		int[] arr=new int[3];
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		int lar=arr[0]; 
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(arr[i]>lar)
			{
				lar=arr[i];
				
			}
		}
		
	System.out.println("largest no is:"+lar);
	System.out.println("sum of 3 no is "+sum);
	}

}
