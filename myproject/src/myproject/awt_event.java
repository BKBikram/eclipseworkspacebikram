 package myproject;    
   import java.awt.*;  
	import java.awt.event.*;  
	class awt_event extends Frame implements ActionListener
	{  
	   TextField tf;  
	awt_event()
	{  
	  
	//create components  
	tf=new TextField();  
	tf.setBounds(60,50,170,20);  
	tf.setBackground(Color.red);
	Button b=new Button("click me");  
	b.setBounds(100,120,80,30);  
	b.setBackground(Color.blue);
	  
	b.addActionListener(this);
	add(b);
	add(tf);  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true);  
	addWindowListener(new WindowAdapter(){
  	  public void windowClosing(WindowEvent we)
  	  {
  	  System.exit(0);
  	  }
     });
	}  
	public void actionPerformed(ActionEvent e)
	  {  
	   tf.setText("Welcome"); 
	   String st="blue";
	   if(st.equals("click me"));
	   setBackground(Color.red);
	   tf.setBackground(Color.blue);
	   
	  }  
	public static void main(String args[]) 
	{  
	  new awt_event();  
	 }  
	}  
	
