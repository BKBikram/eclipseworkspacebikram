package com.exampractice;
class cons1{
	String name;
	int age;
	cons1(String st,int no){
		this.name=st;
		this.age=no;
		System.out.println(name+" "+age);
	}
}
public class ConstructorProgram1 {

	public static void main(String[] args) {
		cons1 co=new cons1("Bikram",24);
		cons1 co1=new cons1("Biplab",25);

	}

}
