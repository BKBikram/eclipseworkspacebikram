package myproject;
class A{
	int i;
	class B{
		int j;
		void m1(){
			System.out.println(j);
		}
	}
}

class innerclass {
	public static void main(String[] args) {
		A obj=new A();
		A.B obj1=obj.new B();
		obj1.j=5;
		//System.out.println(obj1.j);
		obj1.m1();
	}
	

}
