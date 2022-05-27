package com.arraylist;

abstract class abstractionn1 {
	abstract void show(); 
       }
class biki17 extends abstractionn1{
	   int a=15,b=15;
        void show() {
        	System.out.println(a+b);
               }
        }
  class biki_18 extends abstractionn1{
	  int a=30,b=20;
	  void show() {
		  System.out.println(a-b);
		  
	  }
  }
	
class abstractionn{
	public static void main(String[] args){
		
	  biki17 ob=new biki17();
	  biki_18 ob1=new biki_18();
	  
	  ob.show();

				
	}
}

