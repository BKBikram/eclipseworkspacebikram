package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing_cal implements ActionListener{
	JTextField t,t1,t2;
	JButton b,b1;
	swing_cal(){
		JFrame f=new JFrame("calculator");
		//JLabel l=new JLabel("Enter two no:");
		//l.setBounds(20,10,100,50);
		JTextField t=new JTextField();
		t.setBounds(50,50,50,40);
		JTextField t1=new JTextField();
		t1.setBounds(100,50,50,40);
		JButton b=new JButton("+");
		b.setBounds(50,100,50,50);
		//b.setBackground(Color.blue);
		b.addActionListener(this);
		f.add(b);
		f.add(t1);
		f.add(t);
		//f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	   }
	public void actionPerformed(ActionEvent e) {
		String st=t.getText();
		String st1=t1.getText();
		int a=Integer.parseInt(st);
		 int b=Integer.parseInt(st1);  
		
			
		
	   }
	public static void main(String[] args) {
		swing_cal obj=new swing_cal();
		
	}

}
