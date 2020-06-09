/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        try{

String PATH="jdbc:mysql://localhost/";
String PLACE="schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASSWORD);
    
    try{
 String query="select * from usertable";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
ResultSet myresult=mystatement.executeQuery();

if(myresult.next())
{
   LoginWindow obj=new LoginWindow();
    
    obj.setVisible(true);
    
}
    else
{
    CreateAdmin obj=new CreateAdmin();
    obj.setVisible(true);
    
}
    }
    catch(Exception e)
{
JOptionPane.showMessageDialog(null, "Error in query due to "+ e.getMessage());
}

   
        
finally
    {
    myconnection.close();
    }
}
    catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "Error in connection due to "+ e.getMessage());
        }      
}
}
