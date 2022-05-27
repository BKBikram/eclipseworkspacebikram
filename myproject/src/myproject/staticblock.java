package myproject;

class ob{
     static int a;
	static {
		a=10;
		System.out.println("The multiplication table of 10 is");
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+" ="+a*i);
		}
	}
}
public class staticblock {
	static int a;
	{
		System.out.println("This is nonstatic block");
	}
	static {
		a=10;
		System.out.println("The multiplication table of 10 is");
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+" ="+a*i);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		//staticblock obj=new staticblock();
	}
}
