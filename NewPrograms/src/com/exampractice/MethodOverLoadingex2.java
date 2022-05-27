package com.exampractice;
class  methodov{
	static void show(Object s) {
		System.out.println("hi");
	}
	 static void show(String s) {
		System.out.println("hello");
	}
}
public class MethodOverLoadingex2 {

	public static void main(String[] args) {
		methodov.show("ob");	
	}
}
