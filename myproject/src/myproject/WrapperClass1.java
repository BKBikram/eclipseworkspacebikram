package myproject;

public class WrapperClass1 {

	public static void main(String[] args) {
		int a=10;
		Integer b=Integer.valueOf(a);
		Integer c=a;
		System.out.println(a+" "+b+" "+c);
	}

}
