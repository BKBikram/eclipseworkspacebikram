package myproject;
import java.util.Scanner;

public class method4 {
	static int greatest1() {
       Scanner sc=new Scanner(System.in);
      
   	   int[] a=new int[15];
   	   System.out.println("Enter 15 no:");
       for(int i=0;i<15;i++)
       {
    	   a[i]=sc.nextInt();
       }
       int greater=a[0];
       for(int i=0;i<15;i++)
       {
    	   
    	   if(a[i]>greater)
    	   {
    		   greater=a[i];
    	   }
       }
       return greater;
       
	}
       public static void main(String [] args) {
		int r;
		r=greatest1();
		System.out.println("The greatest no is:"+r);
		
	}

}
