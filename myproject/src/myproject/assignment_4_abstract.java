package myproject;
//write a java program to illustrate the use of abstract class
abstract class marks{
	public abstract int getpercentage();	
}
class stud1 extends marks{
	int total;
    stud1(int sub1, int sub2,int sub3)
	{
		total=sub1+sub2+sub3;
	}
	public int getpercentage() {
		int percentage=total*100/300;
		return(percentage);
	}
}
class stud2 extends marks{
	int total;
	stud2(int sub1,int sub2,int sub3,int sub4){
		total=sub1+sub2+sub3+sub4;
	  int	percentage=(total*100/400);
		System.out.println("percentage is"+percentage);
	}
	public int getpercentage() {
		
		int percentage=(total*100)/400;
		return(percentage);
	}
	
}
public class assignment_4_abstract {
	public static void main(String[] args) {
		
//		stud1 obj=new stud1(56,66,69);
//		int r=obj.getpercentage();
//		System.out.println(r);
		
		stud2 obj1=new stud2(55,66,75,96);
		//int r1=obj1.getpercentage();
		//System.out.println(r);
		
	}
}
