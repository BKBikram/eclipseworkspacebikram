package myproject;

class Bik {
   public Bik show() {
		return this;
	}
	
}
class Biki extends Bik{
	public Biki show() {
		System.out.println("hi");
		return this;
		
	}
}
class biki12 extends Bik{
	public biki12 show() {
		System.out.println("This method called");
		return this;
	}
	
}
public class OverRidingEx {

	public static void main(String[] args) {
		Bik b=new biki12();
		b.show();
		
	}

}
