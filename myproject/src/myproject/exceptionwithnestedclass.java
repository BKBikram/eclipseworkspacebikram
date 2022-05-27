package myproject;

import java.util.Scanner;

class nonstatic{
	class biki{
		int a,b;
		void sum() {
			int c=a+b;
			System.out.println("sum is:"+c);
		       }
		void multi(int x,int y) {
			System.out.println("multiplication of given no is:"+x*y);
		}
	}
}
class staticclass {
	static class biki1{
		static int j,k;
		static void division() {
			//try {
			System.out.println(j/k);
			//}
			//catch(Exception e){
				//System.out.println("for division number must not be zero:");
			//}
		
		}
	}
	
	
}
public class exceptionwithnestedclass {
	public static void main(String[] args) {
		nonstatic obj=new nonstatic();
		nonstatic.biki obj1=obj.new biki();
		System.out.println("Enter two no for addition:");
		Scanner sc=new Scanner(System.in);
		obj1.a=sc.nextInt();
		obj1.b=sc.nextInt();
		 int m=7,n=6;
		
		obj1.sum();
		obj1.multi(m, n);
		staticclass.biki1 obj3=new staticclass.biki1();
		System.out.println("enter two no for division");
		obj3.j=sc.nextInt();
		obj3.k=sc.nextInt();
		try {
		obj3.division();
		}
		catch(Exception e){
			System.out.println("for division number must not be zero:");
		}
	}

}
