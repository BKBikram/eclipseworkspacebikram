
import java.util.Scanner;
 public class firstjava
 {
     public static void main(String [] args)
     {
    	 float percentage;
    	 //wap to calculate percentage of a given student in CBSE biard exam.His marks from 5 subjects must be taken as input from the user
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("CBSE percentage of a student:");
    	 System.out.println("Enter 1st subject mark:");
    	 float mil=sc.nextInt();
    	 System.out.println("Enter 2nd subject mark:");
    	 float hin=sc.nextInt();
    	 System.out.println("Enter 3rd subject mark:");
    	 float eng=sc.nextInt();
    	 System.out.println("Enter 4th subject mark:");
    	 float sci=sc.nextInt();
    	 System.out.println("Enter 5th subject mark:");
         float geo=sc.nextInt();
         System.out.println("Enter 6th subject mark:");
         float san=sc.nextInt();
         float sum=mil+hin+eng+sci+geo+san;
         System.out.print("The sum is :");
         System.out.println(sum);
         percentage=(sum/600)*100;
         System.out.print("The percentage is :");
         System.out.print(percentage);
    	/* int num1,num2,num3;
         System.out.println("Enter three numbers:");
         Scanner sc=new Scanner(System.in);
         System.out.println("enter 1st no:");
         num1=sc.nextInt();
         System.out.println("enter 2nd no:");
         num2=sc.nextInt();
         System.out.println("enter 3rd No:");
         num3=sc.nextInt();
         int sum=num1+num2+num3;
         System.out.print("The sum is :");
         System.out.print(sum);
         */
         

    	 
    	 
    	 
     }
	 
 }