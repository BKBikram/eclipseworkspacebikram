package myproject;
import java.util.Arrays;
import java.util.Scanner;
public class secondgreatestno {
	static void secondno(int n[],int len) {
		int i,se=0;
		if(len<2)
		{
			System.out.println("please enter more than 3 no");
		}
		Arrays.sort(n);
		for(i=len-2;i>=0;i++) {
		   if(n[i]!=len-1)
		   {
			   System.out.println("second largest no is"+n[i]);
			   return;
		   }
		}
		
	}
	public static void main(String[] args) {
		System.out.println("how much array element u want to store:");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] n=new int[len];
		System.out.println("Enter nos");
		for(int i=0;i<len;i++)
		{
			n[i]=sc.nextInt();
		}
		secondno(n,len);
		
		
		
	}

}
