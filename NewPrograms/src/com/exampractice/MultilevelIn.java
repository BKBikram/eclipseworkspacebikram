package com.exampractice;
class bip{
	int a=20,b=20;
}
 class bikr extends bip{
     int a=super.a;
	 void show() {
		System.out.println(a);
	}
}
public class MultilevelIn {

	public static void main(String[] args) {
		bikr ob=new bikr();
		ob.show();
	}

}
