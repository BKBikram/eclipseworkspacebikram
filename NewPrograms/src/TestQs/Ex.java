package TestQs;

class xy{
	int i;
	public void printNum()
	{
	System.out.println(i);	
	}
}
class xz extends xy{
	int j;
	public void printNum() 
	{
		super.printNum();
		System.out.println(j);
	}
	
}
public class Ex {

	public static void main(String[] args) {
		xz ob=new xz();
		ob.i=5;
		ob.j=6;
		ob.printNum();
		

	}

}
