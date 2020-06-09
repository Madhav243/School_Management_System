/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class UpdateManagementHead extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddManagementHead
     */
    public UpdateManagementHead() {
        initComponents();
    }
String imagename2;
   File myfile;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EmailAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Salary = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        Qualification = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        ibox = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Update Head");

        jLabel1.setText("First Name");

        jLabel4.setText("Email Address");

        EmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressActionPerformed(evt);
            }
        });

        jLabel5.setText("Salary");

        Salary.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel6.setText("Gender");

        buttonGroup1.add(Male);
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        Male.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MaleKeyReleased(evt);
            }
        });

        buttonGroup1.add(Female);
        Female.setText("Female");
        Female.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FemaleKeyReleased(evt);
            }
        });

        jLabel7.setText("Phone Number");

        PhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });

        jLabel8.setText("Address");

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        jButton1.setText("UPDATE");
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

        jLabel9.setText("Username-:");

        jLabel10.setText("Password-:");

        jLabel2.setText("Qualification");

        jLabel3.setText("Last Name");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        Delete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DeleteKeyReleased(evt);
            }
        });

        ibox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Upload Image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(Delete))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(password)
                                            .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(PhoneNumber))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))))
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(Qualification))
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(Male)
                                .addGap(18, 18, 18)
                                .addComponent(Female)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(ibox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Male)
                            .addComponent(Female)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(ibox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jButton3)
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Delete))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String filename;
if(myfile!=null)
{
    long timestamp=new java.util.Date().getTime();
    filename=timestamp + myfile.getName();
    try{
        FileInputStream fin=new FileInputStream(myfile.getAbsolutePath());
        FileOutputStream fout=new FileOutputStream("uploads//"+filename);
        int c;
        byte mybuffer[]=new byte[1024];
        while((c=fin.read(mybuffer))!=-1){
        
        fout.write(mybuffer,0,c);
        
        }
        fout.close();
        fin.close();
        
        
    }
    catch(Exception e){
    e.printStackTrace();
    }}
    else{
            filename=imagename2;
            }



        
        
        
        try{
String PATH="jdbc:mysql://localhost/";
String PLACE="Schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH + PLACE,USERNAME,PASSWORD);

try{
    String query="update ManagementHead set password=?,FirstName=?,LastName=?,Qualification=?,EmailAddress=?,Salary=?,Gender=?,PhoneNumber=?,Address=?,Image=? where Username=? ";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    mystatement.setString(2,FirstName.getText());
    mystatement.setString(3,LastName.getText());
    mystatement.setString(4,Qualification.getText());
    mystatement.setString(5,EmailAddress.getText());
    mystatement.setString(6,Salary.getText());
    if(Male.isSelected())
    {
    mystatement.setString(7,"Male");
    }
else
    {
    mystatement.setString(7,"Female");
    }
    mystatement.setString(8,PhoneNumber.getText());
    mystatement.setString(9,Address.getText());
    mystatement.setString(10,filename);
    mystatement.setString(11,Username.getText());
    mystatement.setString(1,password.getText());

    String query1="update usertable set password=? where Username=? ";
    PreparedStatement mystatement1=myconnection.prepareStatement(query1);
    mystatement1.setString(1,password.getText());
    mystatement1.setString(2,Username.getText());


if(mystatement.executeUpdate()>0 && mystatement1.executeUpdate()>0){
JOptionPane.showMessageDialog(rootPane, "Update Successfully");
FirstName.setText("");LastName.setText("");EmailAddress.setText("");Qualification.setText("");
Salary.setText("");buttonGroup1.clearSelection();PhoneNumber.setText("");Address.setText("");
Username.setText("");password.setText("");ibox.setIcon(null);

}

}
catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, "Error is due to "+ e.getMessage());
    
    
}
finally {
myconnection.close();
}
}
catch(Exception e){
JOptionPane.showMessageDialog(rootPane, "Error in connection due to "+ e.getMessage());

}        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressActionPerformed

    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try{

String PATH="jdbc:mysql://localhost/";
String PLACE="schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASSWORD);
    
    try{
 String query="select * from managementhead where Username like ?";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    
mystatement.setString(1,"%"+ Username.getText()+"%");
ResultSet myresult=mystatement.executeQuery();
if(myresult.next())
{
    String username,password1,firstname,lastname,qualification,email,salary,gender,phoneno,address;
   username=myresult.getString("Username");
  password1=myresult.getString("Password");
   firstname=myresult.getString("FirstName");
   lastname=myresult.getString("LastName");
   qualification=myresult.getString("Qualification");
   email=myresult.getString("EmailAddress");
   salary=myresult.getString("Salary");
   gender=myresult.getString("Gender");
   phoneno=myresult.getString("PhoneNumber");
  address=myresult.getString("Address");
   String myFile=myresult.getString("Image");
                    imagename2=myFile;
                    Image simg=ImageIO.read(new File("uploads//"+myFile)).getScaledInstance(ibox.getWidth(),ibox.getHeight(), Image.SCALE_DEFAULT);
                    ibox.setIcon(new ImageIcon(simg));

   FirstName.setText(firstname);LastName.setText(lastname);EmailAddress.setText(email);Qualification.setText(qualification);
Salary.setText(salary);PhoneNumber.setText(phoneno);Address.setText(address);
Username.setText(username);password.setText(password1);
if(gender.equals("Male")){

Male.setSelected(true);


}
else
{

Female.setSelected(true);}
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       int answer=JOptionPane.showConfirmDialog(rootPane,"Do u want to delete?","Are u Sure?",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
       if(answer==JOptionPane.YES_OPTION){
           File myfile=new File("uploads//"+imagename2);
                    myfile.delete();
                    
       
       try{
String PATH="jdbc:mysql://localhost/";
String PLACE="Schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH + PLACE,USERNAME,PASSWORD);

try{
    String query="delete from managementhead where Username=? ";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    mystatement.setString(1,Username.getText());
 String query1="delete from usertable where Username=? ";
    PreparedStatement mystatement1=myconnection.prepareStatement(query1);
    mystatement1.setString(1,Username.getText());


if(mystatement.executeUpdate()>0 && mystatement1.executeUpdate()>0 ){
JOptionPane.showMessageDialog(rootPane, "Deleted Successfully");
FirstName.setText("");LastName.setText("");EmailAddress.setText("");Qualification.setText("");
Salary.setText("");buttonGroup1.clearSelection();PhoneNumber.setText("");Address.setText("");
Username.setText("");password.setText("");ibox.setIcon(null);

}

}
catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, "Error is due to "+ e.getMessage());
    
    
}
finally {
myconnection.close();
}
}
catch(Exception e){
JOptionPane.showMessageDialog(rootPane, "Error in connection due to "+ e.getMessage());

}        
        
        
       }
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
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
    
mystatement.setString(1,"%"+ Username.getText()+"%");
ResultSet myresult=mystatement.executeQuery();
if(myresult.next())
{
    String username,password1,firstname,lastname,qualification,email,salary,gender,phoneno,address;
   username=myresult.getString("Username");
  password1=myresult.getString("Password");
   firstname=myresult.getString("FirstName");
   lastname=myresult.getString("LastName");
   qualification=myresult.getString("Qualification");
   email=myresult.getString("EmailAddress");
   salary=myresult.getString("Salary");
   gender=myresult.getString("Gender");
   phoneno=myresult.getString("PhoneNumber");
  address=myresult.getString("Address");
   FirstName.setText(firstname);LastName.setText(lastname);EmailAddress.setText(email);Qualification.setText(qualification);
Salary.setText(salary);PhoneNumber.setText(phoneno);Address.setText(address);
Username.setText(username);password.setText(password1);
if(gender.equals("Male")){

Male.setSelected(true);


}
else
{

Female.setSelected(true);}
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
    }//GEN-LAST:event_jButton2KeyReleased

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){

        String filename;
if(myfile!=null)
{
    long timestamp=new java.util.Date().getTime();
    filename=timestamp + myfile.getName();
    try{
        FileInputStream fin=new FileInputStream(myfile.getAbsolutePath());
        FileOutputStream fout=new FileOutputStream("uploads//"+filename);
        int c;
        byte mybuffer[]=new byte[1024];
        while((c=fin.read(mybuffer))!=-1){
        
        fout.write(mybuffer,0,c);
        
        }
        fout.close();
        fin.close();
        
        
    }
    catch(Exception e){
    e.printStackTrace();
    }}
    else{
            filename=imagename2;
            }



        
        
        
        try{
String PATH="jdbc:mysql://localhost/";
String PLACE="Schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH + PLACE,USERNAME,PASSWORD);

try{
    String query="update ManagementHead set password=?,FirstName=?,LastName=?,Qualification=?,EmailAddress=?,Salary=?,Gender=?,PhoneNumber=?,Address=?,Image=? where Username=? ";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    mystatement.setString(2,FirstName.getText());
    mystatement.setString(3,LastName.getText());
    mystatement.setString(4,Qualification.getText());
    mystatement.setString(5,EmailAddress.getText());
    mystatement.setString(6,Salary.getText());
    if(Male.isSelected())
    {
    mystatement.setString(7,"Male");
    }
else
    {
    mystatement.setString(7,"Female");
    }
    mystatement.setString(8,PhoneNumber.getText());
    mystatement.setString(9,Address.getText());
    mystatement.setString(10,filename);
    mystatement.setString(11,Username.getText());
    mystatement.setString(1,password.getText());

    String query1="update usertable set password=? where Username=? ";
    PreparedStatement mystatement1=myconnection.prepareStatement(query1);
    mystatement1.setString(1,password.getText());
    mystatement1.setString(2,Username.getText());


if(mystatement.executeUpdate()>0 && mystatement1.executeUpdate()>0){
JOptionPane.showMessageDialog(rootPane, "Update Successfully");
FirstName.setText("");LastName.setText("");EmailAddress.setText("");Qualification.setText("");
Salary.setText("");buttonGroup1.clearSelection();PhoneNumber.setText("");Address.setText("");
Username.setText("");password.setText("");ibox.setIcon(null);

}

}
catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, "Error is due to "+ e.getMessage());
    
    
}
finally {
myconnection.close();
}
}
catch(Exception e){
JOptionPane.showMessageDialog(rootPane, "Error in connection due to "+ e.getMessage());

}        
        
        

}
    }//GEN-LAST:event_jButton1KeyReleased

    private void DeleteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       int answer=JOptionPane.showConfirmDialog(rootPane,"Do u want to delete?","Are u Sure?",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
       if(answer==JOptionPane.YES_OPTION){
       
       try{
            File myfile=new File("uploads//"+imagename2);
                    myfile.delete();
String PATH="jdbc:mysql://localhost/";
String PLACE="Schooldb";
String USERNAME="root";
String PASSWORD="";
Connection myconnection=DriverManager.getConnection(PATH + PLACE,USERNAME,PASSWORD);

try{
    String query="delete from managementhead where Username=? ";
    PreparedStatement mystatement=myconnection.prepareStatement(query);
    mystatement.setString(1,Username.getText());
 String query1="delete from usertable where Username=? ";
    PreparedStatement mystatement1=myconnection.prepareStatement(query1);
    mystatement1.setString(1,Username.getText());


if(mystatement.executeUpdate()>0 && mystatement1.executeUpdate()>0 ){
JOptionPane.showMessageDialog(rootPane, "Deleted Successfully");
FirstName.setText("");LastName.setText("");EmailAddress.setText("");Qualification.setText("");
Salary.setText("");buttonGroup1.clearSelection();PhoneNumber.setText("");Address.setText("");
Username.setText("");password.setText("");ibox.setIcon(null);

}

}
catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, "Error is due to "+ e.getMessage());
    
    
}
finally {
myconnection.close();
}
}
catch(Exception e){
JOptionPane.showMessageDialog(rootPane, "Error in connection due to "+ e.getMessage());

}        
        
        
       }



}
    }//GEN-LAST:event_DeleteKeyReleased

    private void MaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MaleKeyReleased
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       Male.setSelected(true);
       }
    }//GEN-LAST:event_MaleKeyReleased

    private void FemaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FemaleKeyReleased
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       Female.setSelected(true);
       }
    }//GEN-LAST:event_FemaleKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser myfilechooser2=new JFileChooser();

        myfilechooser2.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory())
                return true;

                String extension=f.getName().substring(f.getName().lastIndexOf(".")+1);
                String allowed[]={"jpg","png","gif","jpeg"};
                for(String a:allowed)
                {
                    if(a.equalsIgnoreCase(extension))
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                return false;

            }

            @Override
            public String getDescription() {
                return "All Picture Files";

            }

        });

        if(myfilechooser2.showOpenDialog(rootPane)==JFileChooser.APPROVE_OPTION)
        {
            myfile=myfilechooser2.getSelectedFile();
            try
            {
                Image simg = ImageIO.read( new File(myfile.getAbsolutePath())).getScaledInstance( ibox.getWidth(), ibox.getHeight(), Image.SCALE_AREA_AVERAGING);
                ibox.setIcon(new ImageIcon(simg));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Cannot read image");
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField EmailAddress;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JRadioButton Male;
    private javax.swing.JFormattedTextField PhoneNumber;
    private javax.swing.JTextField Qualification;
    private javax.swing.JFormattedTextField Salary;
    private javax.swing.JTextField Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel ibox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
