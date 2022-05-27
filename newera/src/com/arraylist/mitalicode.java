package com.arraylist;
import java.util.Scanner;
public class mitalicode {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter how many student's information u want:");
			int n=sc.nextInt();
			String studentName;
			int studentId,studentAge;
			String studentBranch;
			int studentBatch;
			String[] name=new String[n];
			int[] id=new int[n];
			int[] age=new int[n];
			String[] branch=new String[n];
			int[] batch=new int[n];
			double[] marks=new double[n];
			
			for(int i=0;i<n;i++) {
				sc.nextLine();
				System.out.print("enter student name:");
				name[i] =sc.nextLine();
				System.out.print("enter student id:");
				id[i]=sc.nextInt();
				System.out.print("enter student age:");
				age[i]=sc.nextInt();
				System.out.println("");
			}
			//System.out.print("enter your id to see student details:");
			
			//try 
			//{
			System.out.print("enter your id to see student details:");
				for(int i=0;i<n;i++) 
				{
					int st=sc.nextInt();
					if(id[0]==st || id[1]==st || id[2]==st) 
					{
						System.out.print("student name:"+" "+name[i]+"\n");
						System.out.print("student id:"+" "+id[i]+"\n");
						System.out.print("student age:"+" "+age[i]+"\n");
						break;
					}
					else{
						try {
						System.out.print("SORRY!!\nyou have to give your deatils...\n");
						sc.nextLine();
						System.out.print("enter student name");
						studentName=sc.nextLine();
						System.out.print("enter student id");
						studentId=sc.nextInt();
						System.out.print("enter student age:");
						age[i]=sc.nextInt();
						break;
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
					    }
				}
			
			//catch(Exception e){
				//System.out.print("enter valid input:");
			//}
			//sc.nextLine();
			sc.nextLine();
			System.out.print("If you are a teacher enter your name:");
			String[] teacher= {"abheda","devu","mehnaaz","ram"};
			for(int i=0;i<teacher.length;i++) 
			{
				String teach=sc.nextLine();
				if(teach.equals(teacher[0]) || teach.equals(teacher[1]) || teach.equals(teacher[2]) || teach.equals(teacher[3])) 
				{
					System.out.println("congratulations you can add mark");
					for(i=0;i<marks.length;i++) 
					{
						System.out.print("enter student mark:");
						marks[i]=sc.nextDouble();
					}
					break;
				}
				else {
					System.out.print("sorry!! you can't provide marks...\n");
					break;
				
				}
			}
			System.out.print("enter id and see student's result...");
			int resultId=sc.nextInt();
			for(int i=0;i<n;i++) {
				if(id[i]==resultId) {
					
					System.out.print(name[i]+"\n");
					System.out.print(age[i]+"\n");
					System.out.print(marks[i]);
					break;	
				}
				else
				{
					System.out.println("you have entered invalid id");
				}
			}
		}


		}

