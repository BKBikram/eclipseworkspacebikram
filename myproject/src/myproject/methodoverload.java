package myproject;

public class methodoverload {
	int show(int a,int b)
	{
		return a+b;
	}
	float show(float a,float b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		methodoverload obj=new methodoverload();
		System.out.println(obj.show(4,5));
		System.out.println(obj.show(4.5f,53.5f));
	}

}
