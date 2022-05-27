package myproject;
class test{
	static int i;
	void setmethod(int i) 
	    {
		 this.i=i;
	    }
	static void show() 
	  {
	    System.out.println(i);
	  }
}
public class thiskeyword {
	public static void main(String[] args) {
	test t=new test();
	t.setmethod(5);
	test.show();

  }
}
