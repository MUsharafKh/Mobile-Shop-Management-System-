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
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
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
        btnupdate = new com.k33ptoo.components.KButton();
        btndelete = new com.k33ptoo.components.KButton();
        btnadd = new com.k33ptoo.components.KButton();
        btnshow = new com.k33ptoo.components.KButton();
        btnback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        temployee = new javax.swing.JTable();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        txtid = new java.awt.TextField();
        txtcost = new java.awt.TextField();
        txtname = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbtype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(886, 640));

        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 102, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop_pages/Images/apple-phone.png"))); // NOI18N
        kGradientPanel2.add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 113));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCTS");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, -1));

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 131, -1));

        btnshow.setText("SHOW DATA");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 143, -1));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop_pages/Images/external-back-multimedia-kiranshastry-gradient-kiranshastry.png"))); // NOI18N
        btnback.setText("jButton1");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbackMousePressed(evt);
            }
        });
        kGradientPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 90));

        jScrollPane1.setBorder(null);

        temployee.setAutoCreateRowSorter(true);
        temployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "TYPE", "COST"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        temployee.setGridColor(new java.awt.Color(255, 255, 255));
        temployee.setIntercellSpacing(new java.awt.Dimension(5, 5));
        temployee.setRowHeight(25);
        temployee.setSelectionBackground(new java.awt.Color(255, 51, 255));
        jScrollPane1.setViewportView(temployee);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 255, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("COST");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("TYPE");

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MOBILE", "CHARGER", "HEDPHONE" }));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(71, 71, 71)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(132, 132, 132))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMousePressed
        // TODO add your handling code here:
           dispose();
        new Home().show();
    }//GEN-LAST:event_btnbackMousePressed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
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
       else if(txtcost.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Cost");
            return;
        
        }
       else if(cmbtype.getSelectedItem()==null){
        
            JOptionPane.showMessageDialog(null, "Enter the type");
            return;
        
        }
       
        else
        {
            String id=txtid.getText();
           String name=txtname.getText();
            String type=cmbtype.getSelectedItem().toString();
           int cost=Integer.parseInt(txtcost.getText());
           
           
           
           Connection con=DbConnection.dbconnection();
                  
                 Statement st=con.createStatement();
                 String queary="insert into products values('"+id+"','"+name+"','"+type+"','"+cost+"')";
                  int result=st.executeUpdate(queary);
                  if(result>0){
                    JOptionPane.showMessageDialog(null, "succesfully added !!");
               
                  }
                  else{
                  
                   JOptionPane.showMessageDialog(null, "Wrong user name password !!");
                   txtid.setText("");
                   txtname.setText("");
                    cmbtype.setSelectedItem(0);
                   txtcost.setText("");
                   
                  
                  }
                 
                 
                update();
            con.close();
        
        }
       
        
        
        }catch(Exception ex){
        
          JOptionPane.showMessageDialog(null,ex.toString());
        }
        
        
    }//GEN-LAST:event_btnaddActionPerformed

    public void update()
    {
        try{
        
        Connection con=DbConnection.dbconnection();
        Statement st=con.createStatement();
        String quary="select * from products;";
        ResultSet rs=st.executeQuery(quary);
        DefaultTableModel model=(DefaultTableModel) temployee.getModel();
        model.setRowCount(0);
        String name,id,type,cost;
       
        while(rs.next()){
       
        id=rs.getString(1);
        name=rs.getString(2);
        type=rs.getString(3);
        cost=rs.getString(4);
    
        
        String[] row={id,name,type,cost};
        model.addRow(row);
        
        }
        st.close();
        con.close();
        
        
        
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    
    }
    
    
    
    
    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        // TODO add your handling code here:
        
         try{
        
        Connection con=DbConnection.dbconnection();
        Statement st=con.createStatement();
        String quary="select * from products;";
        ResultSet rs=st.executeQuery(quary);
        DefaultTableModel model=(DefaultTableModel) temployee.getModel();
        model.setRowCount(0);
        String name,id,type,cost;
       
        while(rs.next()){
       
        id=rs.getString(1);
        name=rs.getString(2);
        type=rs.getString(3);
        cost=rs.getString(4);
    
        
        String[] row={id,name,type,cost};
        model.addRow(row);
        
        }
        st.close();
        con.close();
        
        
        
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        
    }//GEN-LAST:event_btnshowActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
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
                 String queary="DELETE FROM products WHERE id='"+id+"';";
                  int result=st.executeUpdate(queary);
                  if(result>0){
                    JOptionPane.showMessageDialog(null, "succesfully Dleted !!");
               
                  }
                
                 
                 
                update();
            con.close();
            
            
        
        }
       
        
        
        }catch(Exception ex){
        
          JOptionPane.showMessageDialog(null,ex.toString());
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        try{
        if(txtid.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null, "Enter the User Id");
       
        return;
        
        
        }
       
       else if(txtname.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Name");
            return;
        
        }
       else if(txtcost.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Enter the Cost");
            return;
        
        }
       else if(cmbtype.getSelectedItem()==null){
        
            JOptionPane.showMessageDialog(null, "Enter the type");
            return;
        
        }
       
        else
        {
            String id=txtid.getText();
           String name=txtname.getText();
            String type=cmbtype.getSelectedItem().toString();
           int cost=Integer.parseInt(txtcost.getText());
           
           
           
           Connection con=DbConnection.dbconnection();
                  
                 Statement st=con.createStatement();
                 String queary="UPDATE products SET name = '"+name+"',type='"+type+"',cost='"+cost+"'   WHERE id='"+id+"';";
                  int result=st.executeUpdate(queary);
                  if(result>0){
                    JOptionPane.showMessageDialog(null, "succesfully added !!");
               
                    
                      txtid.setText("");
                   txtname.setText("");
                    cmbtype.setSelectedItem(0);
                   txtcost.setText("");
                   
                    
                  }
           
                 
                 
                update();
            con.close();
        
        }
       
        
        
        }catch(Exception ex){
        
          JOptionPane.showMessageDialog(null,ex.toString());
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnadd;
    private javax.swing.JButton btnback;
    private com.k33ptoo.components.KButton btndelete;
    private com.k33ptoo.components.KButton btnshow;
    private com.k33ptoo.components.KButton btnupdate;
    private javax.swing.JComboBox<String> cmbtype;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTable temployee;
    private java.awt.TextField txtcost;
    private java.awt.TextField txtid;
    private java.awt.TextField txtname;
    // End of variables declaration//GEN-END:variables
}
