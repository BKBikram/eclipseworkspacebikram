package myproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing2 implements ActionListener{
	JTextField tf,tf1;
	swing2(){
		JFrame j=new JFrame("Frame");
		JLabel l=new JLabel("userid");
		l.setBounds(100,50,100,20);
		JTextField tf=new JTextField();
		tf.setBounds(160,50,100,20);
		JLabel l1=new JLabel("password");
		l1.setBounds(100,70,100,20);
		JTextField tf1=new JTextField();
		tf1.setBounds(160,70,100,20);
		JButton b=new JButton("Login");
		b.setBounds(120,90,100,20);
		b.addActionListener(this);
		tf.addActionListener(this);
		j.add(l);
		j.add(tf);
		j.add(l1);
		j.add(tf1);
		j.add(b);
		
		j.setSize(300,300);
		j.setLayout(null);
		j.setVisible(true);
	}
		public void actionPerformed(ActionEvent e){
			tf.setText("HI");
			tf1.setText("Hello");
		
		}
	public static void main(String[] args) {
		swing2 obj=new swing2();
	}

}
