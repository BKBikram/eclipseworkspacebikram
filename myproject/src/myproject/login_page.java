package myproject;
import java.awt.*;
import java.awt.event.*;

class bikram_page extends Frame implements ActionListener{
	bikram_page(){
		/*Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setTitle("Bikram");
		f.setSize(300,300);
		f.setVisible(true);*/
		setBackground(Color.green);
		setVisible(true);
		setSize(300,300);
		setLayout(new FlowLayout());
		Label l=new Label("Username");
		TextField t=new TextField(10);
		Label l1=new Label("Password");
		TextField t1=new TextField(10);
		Button b=new Button("Login");
		b.setBackground(Color.red);
		b.addActionListener(this);
		add(l);
		add(t);
		add(l1);
		add(t1);
		add(b);
		t1.setEchoChar('#');
		//t.setText("bikram");
	   
		addWindowListener(new WindowAdapter(){
		  	  public void windowClosing(WindowEvent we)
		  	  {
		  	  System.exit(0);
		  	  }
		     });
		}

		public void actionPerformed(ActionEvent e) {
			String st="Login";
	      if(st.equals("Login"))
		  setBackground(Color.blue);
	      
	      
			
		}
}

public class login_page {
	public static void main(String[] args) {
			bikram_page og=new bikram_page();
	}

}
