
import javax.swing.*;
import java.awt.event.*;

public class Login implements ActionListener
{ JFrame f = new JFrame("Login");
  JLabel l1,l2,l3;
  JTextField t1;
  JPasswordField t2;
  JButton b1,b2;
  Database db;
  Signup S;
  
  public static void main(String args[])
  {
	  new Login();
  }
    Login()
  {
	    f.setSize(1380,750);
	    f.setLayout(null);
	    f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	  
	    l1=new JLabel("Login Form");
	    f.add(l1);
	   
	    l2=new JLabel("Username");
	    f.add(l2);
	  
	    t1=new JTextField();
	    f.add(t1);
	    
	    l3=new JLabel("Password");
	    f.add(l3);
	  
	    t2=new JPasswordField();
	    f.add(t2);
	    
	    b1 =new JButton("Login");
	    f.add(b1);
	    
	    b2 =new JButton("Sign Up");
	    f.add(b2);
	    
	    l1.setBounds(50,50,200,20);
	    l2.setBounds(50,80,100,20);
	    t1.setBounds(150,80,100,20);
	    l3.setBounds(50,130,100,20);
	    t2.setBounds(150,130,100,20);
	    b1.setBounds(120,180,80,20);
	    b2.setBounds(220,180,80,20);
	   
	    b1.addActionListener(this);
	    b2.addActionListener(this);
  }  
     
  public void actionPerformed(ActionEvent e)
  { db=new Database();
  
	  if(e.getSource()==b1)
      { String u=t1.getText();
        String p=t2.getText();
        
         if(db.checkLogin(u,p))
          {f.setVisible(false);
           CarSalesSystem carSales = new CarSalesSystem("cars.dat");
  		   carSales.setVisible(true);
          }
         else
         { JOptionPane.showMessageDialog(null, "Invalid Username or Password !!","Failed!!",
                JOptionPane.ERROR_MESSAGE); }
        }
      
	  
	  if(e.getSource()==b2)
	  { f.setVisible(false);
	    S=new Signup();
	  }
  }
}
