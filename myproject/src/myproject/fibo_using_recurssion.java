package myproject;

public class fibo_using_recurssion {
	 static int fib(int n)
	     {
	      if(n<=1)
	      {
	       return n;
	      }
	      
	     return fib(n-1)+fib(n-2);
	}
   
	public static void main(String[] args) {
		System.out.println("Fibonacci series upto 10");
		int n=9;
		int a=0;
		System.out.println(fib(n-2));
		
	}

}
