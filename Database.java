
import java.sql.*;
public class Database 
{  Connection con;
   PreparedStatement pst,stmt1;
   ResultSet rs;
   
   Database()
   {   try
	   {  con=DriverManager.getConnection("jdbc:Mysql://localhost:3307/login","root","");
          pst=con.prepareStatement("select ei from info where un=? and psswd=?");    
          String sql1="insert into info(un,psswd,cont,ei,addr) values (?,?,?,?,?)";
          stmt1=con.prepareStatement(sql1);
        
       }
   
       catch (Exception e) 
       {  System.out.println(e); }
   }
   
   public Boolean checkLogin(String uname,String pwd)
   {  
	   try 
       { pst.setString(1, uname); 
         pst.setString(2, pwd);    
           
         rs=pst.executeQuery();
         if(rs.next())
           { 
             con.close();
             return true;
           }
         else
           { con.close();
             return false; }
         
        } 
   
        catch (Exception e) 
        {  System.out.println("error while validating"+e);
           return false;
        }
   }
   
   public void insert(String u,String p,int c,String ei,String a)
   { try 
    { stmt1.setString(1,u);  
      stmt1.setString(2,p);
      stmt1.setInt(3,c);
      stmt1.setString(4,ei);
      stmt1.setString(5,a); 
      stmt1.executeUpdate();
      con.close();
    }
    catch (Exception e) 
    {  System.out.println("error while validating"+e); }
   }
   
}