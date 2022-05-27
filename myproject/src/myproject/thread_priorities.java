package myproject;

class xyx extends Thread{
	public void run() {
		//Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("hi");
		System.out.println("child thread priority"+"="+Thread.currentThread().getPriority());
	}
}
class xm extends Thread{
	public void run() {
		System.out.println("hello");
	}
}
public class thread_priorities {
	public static void main(String[] args) {
		xyx obj=new xyx();
		obj.start();
		xm obj1=new xm();
		obj1.start();
		System.out.println("main Thread priority"+"="+Thread.currentThread().getPriority());
		obj.setPriority(10);
		
	}

}
