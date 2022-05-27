package myproject;

import java.util.Scanner;

//write a java program to convert the room temprature given in centigrade into farenheit using inheritance
class temperature{
	void tempr(float temp){
		System.out.println("room temperature is "+ temp+"C");
	}
}
class convert extends temperature{
	convert(float temp){
		float far=((temp*9/5)+32);
		System.out.println("After converting the temperature in farnheit is "+far+"F");
	}
	
}
public class assignment_4_Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		temperature t=new temperature();
		System.out.println("Enter room temperature in centigrade:");
		float temp=sc.nextFloat();
		t.tempr(temp);
	
		convert obj=new convert(temp);
	}

}
