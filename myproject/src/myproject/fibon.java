package myproject;

public class fibon {
	public static void main(String[] args) {
		System.out.println("Fibonacci series upto 10");
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		for(int i=2;i<10;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}

}
