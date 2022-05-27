package TestQs;

import java.util.Scanner;

class RectArea{
	float len,bre;
	public void setDim(float length,float breadth) {
		this.len=length;
		this.bre=breadth;
	}
	public float getArea() {
		return len*bre;
	}
	
}
public class Area {
	public static void main(String[] args) {
		System.out.println("enter the length and breadth of the rectangle");
		Scanner sc=new Scanner(System.in);
		float len=sc.nextFloat();
		float bre=sc.nextFloat();
		RectArea ob=new RectArea();
		ob.setDim(len, bre);
		float r=ob.getArea();
		System.out.println(r);
	}
	

}
