package myproject;

public  class varArgsType {
	static void show(int a) {
		System.out.println(a);	
	}
	static void show(String s) {
		System.out.println(s);	
	}
	static void show(int a,String... b) {
		System.out.println(a);
		for(String i:b)
	{
		System.out.print(i+" ");
		}		
	}
	public static void main(String[] args) {
		show(19);
		show("hi");
		show(15,"bikram","biplab","anil");
	}

}
