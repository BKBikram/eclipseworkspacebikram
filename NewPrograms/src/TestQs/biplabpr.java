package TestQs;

import java.util.Scanner;

public class biplabpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the rows:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
      for(i=0;i<n;i++)
      {
    	  for(j=0;j<n;j++)
    	  {
    		  if(i==j && i!=3)
    		  {
    			  System.out.print(i);
    		  }
    		  
    		  else
    		  {
    			  System.out.print(0);
    		  }
    	  }
    	  if(i==2)
    	  {
    		  System.out.print("*");
    	  }
    	 
    	  System.out.println();
      }
	}

}
