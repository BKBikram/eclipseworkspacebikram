package myproject;

class popcorn{
	void taste() {
		System.out.println("salty");
	}
	void color() {
		System.out.println("red");
	}
}

public class anonymous {
	public static void main(String[] args) {
		popcorn obj=new popcorn()
				{
			      void taste() {
			    	  System.out.println("spicy");
			      }
				};
				popcorn p1=new popcorn();
				p1.taste();
				obj.taste();
				//obj.color();
				System.out.println(obj.getClass().getName());  //this is the .class name for anonymous class
		
		
		
		
	}

}
