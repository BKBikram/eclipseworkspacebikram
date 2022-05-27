package myproject;
import javax.swing.*;
import java.awt.*;
class swingd extends JFrame{
	 swingd(){
		 JFrame j=new JFrame();
		 setLayout(new FlowLayout());
		 JLabel l=new JLabel("hi");
		 JLabel l1=new JLabel("hello");
		 //add(j);
		 add(l);
		 add(l1);
		 
		 setSize(400,400);
		 setVisible(true);
	 }
}
public class swing1 {
	public static void main(String[] args)
	{
	   swingd obj=new swingd();	
	}

}
