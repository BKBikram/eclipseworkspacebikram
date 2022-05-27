package myproject;

import java.util.Scanner;

public class mark {
	//Write a Java program which accepts students name, id, and marks and display the highest score and the lowest score.
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	
    	System.out.println("enter how many students:");
    	int stud=sc.nextInt();
    	String name[]=new String[stud];
    	int id[]=new int[stud];
    	float marks[]=new float[stud];
    	
    	for(int i=0;i<stud;i++)
    	{
    		sc.nextLine();
    		System.out.println("Enter student name");
    		name[i]=sc.nextLine();
    		System.out.println("Enter marks");
    		marks[i]=sc.nextFloat();
    		System.out.println("Enter student id");
    		id[i]=sc.nextInt();
    	}
    	System.out.println("entered details are");
    	float lar=marks[0];
    	float low=marks[0];
    	
    	for(int i=0;i<stud;i++)
    	{
    		if(marks[i]>lar)
    		{
    			lar=marks[i];
    		}
    		if(marks[i]<lar)
    		{
    			low=marks[i];
    		}
    		System.out.println(name[i]);
    		System.out.println(marks[i]);
    		System.out.println(id[i]);
    	}
    	System.out.println("highest marks is"+lar);
    	System.out.println("lowest marks is"+low);
    	
    }
}
