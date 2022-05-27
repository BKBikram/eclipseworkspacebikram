package myproject;

import java.awt.*;
import java.awt.Frame;

public class awt1 extends Frame{
	awt1() {
		Button b=new Button("click here");
		b.setBounds(150,40,80,40);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		add(b);
	}
	public static void main(String[] args){
		awt1 ob=new awt1();
		
	}

}
