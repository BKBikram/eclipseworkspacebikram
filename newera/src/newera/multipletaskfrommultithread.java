package newera;
//performing multiple task from single thread

class example extends Thread{
	public void run() {
		System.out.println("task 1");
	}
	
}
class exa extends Thread{
	public void run() {
		System.out.println("task 2");
		
	}
	
}
public class multipletaskfrommultithread {
	public static void main(String[] args) {
		example x=new example();
		exa y=new exa();
		x.start();
		//System.out.println(x.getName());
		y.start();
		x.setName("bikram");
		//System.out.println(x.getName());
		//System.out.println(x.isDaemon());
		//Thread.currentThread().setName("bor");
		//qSystem.out.println(Thread.currentThread());
		
		
		
		
	}

}
