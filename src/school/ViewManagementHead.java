/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewManagementHead extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewManagementHead
     */
    public ViewManagementHead() {
        initComponents();
        
        try{

String PATH="jdbc:mysql://localhost/";
String PLACE="schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASSWORD);
    
    try{
 String query="select * from managementhead ";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    

ResultSet myresult=mystatement.executeQuery();
if(myresult.next())
{
   DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
   do{
   String username,password,firstname,lastname,qualification,email,salary,gender,phoneno,address;
   username=myresult.getString("Username");
  password=myresult.getString("Password");
   firstname=myresult.getString("FirstName");
   lastname=myresult.getString("LastName");
   qualification=myresult.getString("Qualification");
   email=myresult.getString("EmailAddress");
   salary=myresult.getString("Salary");
   gender=myresult.getString("Gender");
   phoneno=myresult.getString("PhoneNumber");
  address=myresult.getString("Address");
   
   mymodel.addRow(new Object[]{username,password,firstname,lastname,qualification,email,salary,gender,phoneno,address});
   
  
   
   
   
  }while(myresult.next());
}
else
{

JOptionPane.showMessageDialog(rootPane,"No record found");
}


}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in query due to "+ e.getMessage());
}
finally{
myconnection.close();
}
    }
catch(Exception e){
        
        JOptionPane.showMessageDialog(rootPane, "Error in connection due to "+ e.getMessage());
        }

                     
          
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setTitle("View Management Heads");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "First Name", "Last Name", "Qualification", "Email ", "Salary", "Gender", "Phone number", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Username");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1223, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{

String PATH="jdbc:mysql://localhost/";
String PLACE="schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASSWORD);
    
    try{
 String query="select * from managementhead where Username like ?";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    
mystatement.setString(1, "%"+Username.getText()+"%");
ResultSet myresult=mystatement.executeQuery();
if(myresult.next())
{
   DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
   mymodel.setRowCount(0);
   do{
   String username,password,firstname,lastname,qualification,email,salary,gender,phoneno,address;
   username=myresult.getString("Username");
  password=myresult.getString("Password");
   firstname=myresult.getString("FirstName");
   lastname=myresult.getString("LastName");
   qualification=myresult.getString("Qualification");
   email=myresult.getString("EmailAddress");
   salary=myresult.getString("Salary");
   gender=myresult.getString("Gender");
   phoneno=myresult.getString("PhoneNumber");
  address=myresult.getString("Address");
   
   mymodel.addRow(new Object[]{username,password,firstname,lastname,qualification,email,salary,gender,phoneno,address});
  }while(myresult.next());
}
else
{

JOptionPane.showMessageDialog(rootPane,"No record found");
}


}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in query due to "+ e.getMessage());
}
finally{
myconnection.close();
}
    }
catch(Exception e){
        
        JOptionPane.showMessageDialog(rootPane, "Error in connection due to "+ e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         try{

String PATH="jdbc:mysql://localhost/";
String PLACE="schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASSWORD);
    
    try{
 String query="select * from managementhead where Username like ?";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    
mystatement.setString(1, "%"+Username.getText()+"%");
ResultSet myresult=mystatement.executeQuery();
if(myresult.next())
{
   DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
   mymodel.setRowCount(0);
   do{
   String username,password,firstname,lastname,qualification,email,salary,gender,phoneno,address;
   username=myresult.getString("Username");
  password=myresult.getString("Password");
   firstname=myresult.getString("FirstName");
   lastname=myresult.getString("LastName");
   qualification=myresult.getString("Qualification");
   email=myresult.getString("EmailAddress");
   salary=myresult.getString("Salary");
   gender=myresult.getString("Gender");
   phoneno=myresult.getString("PhoneNumber");
  address=myresult.getString("Address");
   
   mymodel.addRow(new Object[]{username,password,firstname,lastname,qualification,email,salary,gender,phoneno,address});
  }while(myresult.next());
}
else
{

JOptionPane.showMessageDialog(rootPane,"No record found");
}


}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in query due to "+ e.getMessage());
}
finally{
myconnection.close();
}
    }
catch(Exception e){
        
        JOptionPane.showMessageDialog(rootPane, "Error in connection due to "+ e.getMessage());
        }
        
        
        }
    }//GEN-LAST:event_jButton1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}