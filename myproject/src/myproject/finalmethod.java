package myproject;
class biki5{
	 void method1() {
		System.out.println("Hi");
	}
}
public class finalmethod extends biki5 {
	final void method1() {
		System.out.println("i am in finalmethod class");
	}
	public static void main(String[] args) {
		
		finalmethod obj=new finalmethod();
		obj.method1();
		final int pi=323;
		
	}

}
