package myproject;
/*class AP
{
	public void show() {
		System.out.println("call");
	}
}*/
interface phone{
	void show();
	
}

public class anonymousclass {
	public static void main(String[] args) {
		/*AP obj=new AP()
		{
			public void show() {
				System.out.println("call,sms");
			}
		};
		obj.show();*/
		
		
		//Anonymous implementation
		phone p=new phone()
				{
                  public void show() {
                	  System.out.println("phone is ringing");
                  }
				};
		p.show();
		
	}

}
