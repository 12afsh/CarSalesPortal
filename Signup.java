
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup implements ActionListener
{  JFrame f = new JFrame("Sign Up");
   JLabel l1,l2,l3,l4,l5,l6;
   JTextField t1,t3,t4,t5;
   JPasswordField t2;
   JButton b1;
   Database db;
   Login L;
	
   Signup()
   { f.setSize(1380,750);
     f.setLayout(null);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     l1=new JLabel("Sign Up");
     f.add(l1);
     
     l2=new JLabel("Username");
     f.add(l2);
     t1=new JTextField();
     f.add(t1);
     
     l3=new JLabel("Password");
     f.add(l3);
     t2=new JPasswordField();
     f.add(t2);
	 
     l4=new JLabel("Contact \nNumber");
     f.add(l4);
     t3=new JTextField();
     f.add(t3);
     
     l5=new JLabel("Email Id");
     f.add(l5);
     t4=new JTextField();
     f.add(t4);
     
     l6=new JLabel("Address");
     f.add(l6);
     t5=new JTextField();
     f.add(t5);
     
     b1 =new JButton("Submit");
	 f.add(b1);
     
     l1.setBounds(80,50,200,20);
	 l2.setBounds(50,80,100,20);
	 l3.setBounds(50,130,100,20);
	 l4.setBounds(50,180,100,20);
	 l5.setBounds(50,230,100,20);
	 l6.setBounds(50,280,100,20);
	 t1.setBounds(180,80,100,20);
	 t2.setBounds(180,130,100,20);
	 t3.setBounds(180,180,100,20);
	 t4.setBounds(180,230,100,20);
	 t5.setBounds(180,280,100,80);
	 b1.setBounds(180,380,80,20);
	 
	 b1.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   { db=new Database();
   
       String u=t1.getText();
       String p=t2.getText();
       int c=Integer.parseInt(t3.getText());
       String ei=t4.getText();
       String a=t5.getText();
       
       f.setVisible(false);
       db.insert(u,p,c,ei,a);
       L=new Login();   
   }
}