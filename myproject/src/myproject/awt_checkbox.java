package myproject;
import java.awt.*;
class bikr_checkbox extends Frame 
   {
	bikr_checkbox()
	{
		Frame f=new Frame();
		f.setSize(300,300);
		Checkbox ch=new Checkbox("c",true);
		ch.setBounds(100,50,150,50);
		Checkbox ch1=new Checkbox("Java",false);
		f.setLayout(null);
		f.setVisible(true);
		f.add(ch);
	}
	
	
}
public class awt_checkbox {
	public static void main(String[] args) 
	{
	bikr_checkbox obj=new bikr_checkbox();
	}

}
