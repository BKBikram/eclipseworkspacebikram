package myproject;

import java.util.Scanner;

//wap to implement multilevel inheritance for calculating the overall performance of a student
class multi{
	    void m1(int mark) {
		if(mark>=540 && mark<600) {
			System.out.println("your mark is "+mark+" Your grade is 'O'");
		}
		else if(mark>=480) {
			System.out.println("your mark is "+mark+" Your grade is 'A1'");
		}
		else if(mark>=420) {
			System.out.println("your mark is "+mark+" Your grade is 'B1'");
		}
		else if(mark>=360) {
			System.out.println("your mark is "+mark+" Your grade is 'B2'");
		}
		else if(mark>=300) {
			System.out.println("your mark is "+mark+" Your grade is 'C'");
		}
		else if(mark>=240) {
			System.out.println("your mark is "+mark+" Your grade is 'D'");
		}
		else if(mark>=198) {
			System.out.println("your mark is "+mark+" Your grade is 'E'");
		}
		else if(mark>=0 && mark<=197) {
			System.out.println("your mark is "+mark+" Your grade is 'F'");
		}
	}

        }
class multi1 extends multi
       {
	 int java,ooad,cn,ada,iwp;
	void m1() {
		int mark=java+ooad+cn+ada+iwp;
		m1(mark);
	   }
       }
public class multilevel extends multi1 {
	public static void main(String[] args) {
		multilevel obj=new multilevel();
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter java mark");
	     obj.java=sc.nextInt();
	     System.out.println("Enter ooad mark");
	     obj.ooad=sc.nextInt();
	     System.out.println("Enter cn mark");
	     obj.cn=sc.nextInt();
	     System.out.println("Enter ada mark");
	     obj.ada=sc.nextInt();
	     System.out.println("Enter iwp mark");
	     obj.iwp=sc.nextInt();
	     //System.out.println("Enter  mark");
	    // obj.mathematics=sc.nextInt();
	    obj.m1();
		
		
		
	}

}
