package myproject;
//write a program to create a class of employee with the follwoing element emp-code, emp-name,emp-salary, emp age to accept data from 
//the user and display it
import java.util.Scanner;
class employee{
	String emp_name;
	int emp_id,emp_age;
	double emp_salary;
}

public class employee1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:");
		employee e1=new employee();
		e1.emp_name=sc.nextLine();
		System.out.println("Enter the employee id");
		e1.emp_id=sc.nextShort();
		System.out.println("Enter empployee age:");
		e1.emp_age=sc.nextByte();
		System.out.println("Enter empployee salary:");
		e1.emp_salary=sc.nextDouble();
		System.out.println();
		System.out.println();
		System.out.println("your employee datails are:");
		System.out.println(e1.emp_name+" employee id:"+e1.emp_id);
		
	}
	

}
