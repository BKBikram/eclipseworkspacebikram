package com.exampractice;

class Employee{
	String ename;
	int eid;
	static String company="Interland";
	Employee em;
	Employee(String name,int id){
		this.ename=name;
		this.eid=id;
		System.out.println("Employee name="+ename+" "+"Employee id="+eid+"Company name"+company);
	}
}
public class StaticVariableuse {

	public static void main(String[] args) {
		new Employee("Biplab",5);
		new Employee("Chita",6);
		new Employee("satya",7);
		new Employee("pranab",1);
	        
	}

}
