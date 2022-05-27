package myproject;
import java.awt.*;
import java.awt.event.*;
public class firstawt extends Frame {
	
	firstawt(){
		Button b=new Button("click here");
		b.setBounds(100,50,80,30);
		add(b);
		setSize(300,300);
		setTitle("This is my first awt");
		
	    setLayout(null);
	    setVisible(true);
	    addWindowListener(new WindowAdapter(){
	    	  public void windowClosing(WindowEvent we)
	    	  {
	    	  System.exit(0);
	    	  }
	    });
	
		
	}
	public static void main(String[] args) {
		firstawt obj=new firstawt();
	}

}
