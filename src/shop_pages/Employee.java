/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shop_pages;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import  java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        lblimage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        btnback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        temployee = new javax.swing.JTable();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        txtid = new java.awt.TextField();
        txtsalary = new java.awt.TextField();
        txtaddress = new java.awt.TextField();
        txtcontact = new java.awt.TextField();
        txtname = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbtype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 102, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop_pages/Images/men-age-group-5--v2.png"))); // NOI18N
        kGradientPanel2.add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 113));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMPLOYEE");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        kButton3.setText("UPDATE");
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, -1));

        kButton2.setText("DELETE");
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, -1));

        kButton1.setText("ADD");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 131, -1));

        kButton4.setText("SHOW DATA");
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 143, -1));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop_pages/Images/external-back-multimedia-kiranshastry-gradient-kiranshastry.png"))); // NOI18N
        btnback.setText("jButton1");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnbackMouseReleased(evt);
            }
        });
        kGradientPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 90));

        jScrollPane1.setBorder(null);

        temployee.setAutoCreateRowSorter(true);
        temployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "TYPE", "SALARY", "ADDRESS", "CONTACT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        temployee.setGridColor(new java.awt.Color(255, 255, 255));
        temployee.setIntercellSpacing(new java.awt.Dimension(5, 5));
        temployee.setRowHeight(25);
        temployee.setSelectionBackground(new java.awt.Color(122, 72, 222));
        jScrollPane1.setViewportView(temployee);
        if (temployee.getColumnModel().getColumnCount() > 0) {
            temployee.getColumnModel().getColumn(0).setResizable(false);
            temployee.getColumnModel().getColumn(0).setPreferredWidth(10);
            temployee.getColumnModel().getColumn(1).setResizable(false);
            temployee.getColumnModel().getColumn(1).setPreferredWidth(10);
            temployee.getColumnModel().getColumn(2).setResizable(false);
            temployee.getColumnModel().getColumn(2).setPreferredWidth(10);
            temployee.getColumnModel().getColumn(3).setResizable(false);
            temployee.getColumnModel().getColumn(3).setPreferredWidth(10);
            temployee.getColumnModel().getColumn(4).setResizable(false);
            temployee.getColumnModel().getColumn(5).setResizable(false);
            temployee.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 255, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("SALARY");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("ADDRESS");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("CONTACT");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("TYPE");

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SALES MAN", "ACCOUNTANT", "CLEANER", "CASHIAR" }));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(33, 33, 33)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbtype, 0, 245, Short.MAX_VALUE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(cmbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 890, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMouseReleased

    private void btnbackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMousePressed
        // TODO add your handling code here:
           dispose();
        new Home().show();
    }//GEN-LAST:event_btnbackMousePressed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        try{
         if(txtid.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null, "Enter the ID");
       
        return;
        
        
        }
       
       else if(txtname.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Name");
            return;
        
        }
       else if(txtaddress.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Address");
            return;
        
        }
       else if(txtcontact.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Contact number");
            return;
        
        }
         else if(txtsalary.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Salary");
            return;
        
        }
        
        else if(cmbtype.getSelectedItem() ==null){
        
            JOptionPane.showMessageDialog(null, "Enter the Typ");
            return;
        
        }
        
    
        else{
        
        try{
        
        if(txtid.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null, "Enter the ID");
       
        return;
        
        
        }
       
       else if(txtname.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Name");
            return;
        
        }
       else if(txtaddress.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Address");
            return;
        
        }
       else if(txtcontact.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the contact");
            return;
        
        }
       
        else
        {
            String id=txtid.getText();
           String name=txtname.getText();
            String address=txtaddress.getText();
           int contact=Integer.parseInt(txtcontact.getText());
           int salary=Integer.parseInt(txtsalary.getText());
           String type=cmbtype.getSelectedItem().toString();
           
           
           
           
           Connection con=DbConnection.dbconnection();
                  
                 Statement st=con.createStatement();
                 String queary="insert into Employee values('"+id+"','"+name+"','"+type+"','"+salary+"','"+address+"','"+contact+"')";
                  int result=st.executeUpdate(queary);
                  if(result>0){
                    JOptionPane.showMessageDialog(null, "succesfully added !!");
               
                  }
                  else{
                  
                   JOptionPane.showMessageDialog(null, "Connection is not stablished");
                   txtid.setText("");
                   txtname.setText("");
                    txtaddress.setText("");
                   txtcontact.setText("");
                   txtsalary.setText("");
                   cmbtype.setSelectedItem(0);
                   
                   
                  
                  }
                 
                 
                update();
            con.close();
        
        }
       
        
        }catch(Exception ex){
        
        JOptionPane.showMessageDialog(null ,ex.toString());
        }
            
        
        
        }
        }catch(Exception ex){
        
       
        
            JOptionPane.showMessageDialog(null,ex.toString());
            
        
        
        
        }
   
    }//GEN-LAST:event_kButton1ActionPerformed

    public void update()
    {
         try{
        
        Connection con=DbConnection.dbconnection();
        Statement st=con.createStatement();
        String quary="select * from employee;";
        ResultSet rs=st.executeQuery(quary);
        DefaultTableModel model=(DefaultTableModel) temployee.getModel();
        model.setRowCount(0);
        String name,id,type,addres,contact,salary;
       
        while(rs.next()){
       
        id=rs.getString(1);
        name=rs.getString(2);
        type=rs.getString(3);
        addres=rs.getString(4);
        contact=rs.getString(5);
        salary=rs.getString(6);
        
        String[] row={id,name,type,salary,addres,contact};
        model.addRow(row);
        
        }
        st.close();
        con.close();
        
        
        
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    
    
    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        try{
        
        Connection con=DbConnection.dbconnection();
        Statement st=con.createStatement();
        String quary="select * from employee;";
        ResultSet rs=st.executeQuery(quary);
        DefaultTableModel model=(DefaultTableModel) temployee.getModel();
        model.setRowCount(0);
        String name,id,type,addres,contact,salary;
       
        while(rs.next()){
       
        id=rs.getString(1);
        name=rs.getString(2);
        type=rs.getString(3);
        addres=rs.getString(4);
        contact=rs.getString(5);
        salary=rs.getString(6);
        
        String[] row={id,name,type,salary,addres,contact};
        model.addRow(row);
        
        }
        st.close();
        con.close();
        
        
        
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
         try{
        if(txtid.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null, "Enter the User id you want to delete");
       
        return;
        }
       
       
        else
        {
            String id=txtid.getText();
          
           
           
           
           Connection con=DbConnection.dbconnection();
                  
                 Statement st=con.createStatement();
                 String queary="DELETE FROM employee WHERE id='"+id+"';";
                  int result=st.executeUpdate(queary);
                  if(result>0){
                    JOptionPane.showMessageDialog(null, "succesfully Dleted !!");
               
                  }
                
                 
                 
                
            con.close();
        
        }
       
        
        
        }catch(Exception ex){
        
          JOptionPane.showMessageDialog(null,ex.toString());
        }
        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        
        
          try{
         if(txtid.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null, "Enter the ID");
       
        return;
        
        
        }
       
       else if(txtname.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Name");
            return;
        
        }
       else if(txtaddress.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Address");
            return;
        
        }
       else if(txtcontact.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the contact");
            return;
        
        }
         else if(txtsalary.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Salaray");
            return;
        
        }
        
        else if(cmbtype.getSelectedItem() ==null){
        
            JOptionPane.showMessageDialog(null, "Enter the Type");
            return;
        
        }
        
    
        else{
        
        try{
        
        if(txtid.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null, "Enter the User ID");
       
        return;
        
        
        }
       
       else if(txtname.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Name");
            return;
        
        }
       else if(txtaddress.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Address");
            return;
        
        }
       else if(txtcontact.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the contact");
            return;
        
        }
       
        else
        {
            String id=txtid.getText();
           String name=txtname.getText();
            String address=txtaddress.getText();
           int contact=Integer.parseInt(txtcontact.getText());
           int salary=Integer.parseInt(txtsalary.getText());
           String type=cmbtype.getSelectedItem().toString();
           
           
           
           
           Connection con=DbConnection.dbconnection();
                  
                 Statement st=con.createStatement();
                 String queary="UPDATE employee SET name = '"+name+"', type = '"+type+"',salary='"+salary+"',address='"+address+"',contact='"+contact+"'   WHERE id='"+id+"';";
                  int result=st.executeUpdate(queary);
                  if(result>0){
                    JOptionPane.showMessageDialog(null, "succesfully added !!");
               
                    txtid.setText("");
                    txtname.setText("");
                    txtaddress.setText("");
                    txtcontact.setText("");
                    cmbtype.setSelectedItem(1);
                    txtsalary.setText("");
                    
                  }
                 
                 
                 
             update();
            con.close();
        
        }
       
        
        }catch(Exception ex){
        
        JOptionPane.showMessageDialog(null ,ex.toString());
        }
            
        
        
        }
        }catch(Exception ex){
        
       
        
            JOptionPane.showMessageDialog(null,ex.toString());
            
        
        
        
        }
        
        
    }//GEN-LAST:event_kButton3ActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> cmbtype;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTable temployee;
    private java.awt.TextField txtaddress;
    private java.awt.TextField txtcontact;
    private java.awt.TextField txtid;
    private java.awt.TextField txtname;
    private java.awt.TextField txtsalary;
    // End of variables declaration//GEN-END:variables
}
