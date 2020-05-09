/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author chris
 */
public class AddInfo extends javax.swing.JFrame {
    
    private static final ArrayList<Course> course = new ArrayList<Course>();
    private static final ArrayList<Students> students = new ArrayList<Students>();

    /**
     * Creates new form AddInfo
     */
    public AddInfo() {
        initComponents();
         addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Tutor Center", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException err) {
                    JOptionPane.showMessageDialog(null,err);
                }
       
                final String ID = "cseyou1";
                final String PW = "Cosc*ymfw";
                final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/cseyou1db";

                try
                {

                    Connection con = DriverManager.getConnection(SERVER,ID,PW);
                    Statement stmt = con.createStatement();

                    stmt.executeUpdate("DELETE FROM cseyou1db.Tutor_signin");
                    stmt.executeUpdate("DELETE FROM cseyou1db.Tutee_signin");



                }
                catch(SQLException error)
                {
                    JOptionPane.showMessageDialog(null,error);
                }
                System.exit(0);
                    }else {
                        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                    }
                 
                        
                    }
                });
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
        jLabel2 = new javax.swing.JLabel();
        firstIN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastIN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        courseIN = new javax.swing.JTextField();
        addTutorbtn = new javax.swing.JButton();
        addTuteeBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        IDIN = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADD NEW STUDENT");

        jLabel2.setText("First Name");

        firstIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstINActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name");

        lastIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastINActionPerformed(evt);
            }
        });

        jLabel4.setText("Course Number");

        addTutorbtn.setText("Add Tutor");
        addTutorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTutorbtnActionPerformed(evt);
            }
        });

        addTuteeBtn.setText("Add Tutee");
        addTuteeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTuteeBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Towson ID");

        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(addTutorbtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addTuteeBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(courseIN))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastIN)
                                .addComponent(firstIN, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(IDIN))))
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IDIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstIN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(courseIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTutorbtn)
                    .addComponent(addTuteeBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstINActionPerformed

    private void lastINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastINActionPerformed

    private void addTutorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTutorbtnActionPerformed
        course.clear();
        students.clear();
        boolean check = true;
        String numIN = courseIN.getText();
        String first = firstIN.getText();
        String last = lastIN.getText();
        String TUIDIN = IDIN.getText();
        ArrayList<String> course = new ArrayList<String>();
        ArrayList<String> num = new ArrayList<String>();
        course.add("330");
        num.add("1");
        course.add("263");
        num.add("2");
        course.add("100");
        num.add("3");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,e);
        }
       
        final String ID = "cseyou1";
        final String PW = "Cosc*ymfw";
        final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/cseyou1db";
        
        try
        {
            
            Connection con = DriverManager.getConnection(SERVER,ID,PW);
            Statement stmt = con.createStatement();
            for(int n=0; n < course.size();n++){
                String i = course.get(n);
                if(i.equals(numIN)){
                    check = false;
                    stmt.executeUpdate("INSERT INTO cseyou1db.Students VALUES ('"+TUIDIN+"', '"+last+"', '"+first+"')");
                    stmt.executeUpdate("INSERT INTO cseyou1db.Tutor VALUES ('"+TUIDIN+"')");
                    stmt.executeUpdate("INSERT INTO cseyou1db.Study VALUES ('"+num.get(n)+"', '"+course.get(n)+"', '"+TUIDIN+"')");
                    stmt.executeUpdate("INSERT INTO cseyou1db.Math_Class VALUES ('"+course.get(n)+"', '"+TUIDIN+"')");
                    JOptionPane.showMessageDialog(null,"Add Tutor","Successful!",JOptionPane.PLAIN_MESSAGE);
                }
            }
            if(check){
                JOptionPane.showMessageDialog(null,"Add Tutor","Unsuccessful!",JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_addTutorbtnActionPerformed

    private void addTuteeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTuteeBtnActionPerformed
        course.clear();
        students.clear();
        boolean check = true;
        String numIN = courseIN.getText();
        String first = firstIN.getText();
        String last = lastIN.getText();
        String TUIDIN = IDIN.getText();
        ArrayList<String> course = new ArrayList<String>();
        ArrayList<String> num = new ArrayList<String>();
        course.add("330");
        num.add("1");
        course.add("263");
        num.add("2");
        course.add("100");
        num.add("3");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,e);
        }
       
        final String ID = "cseyou1";
        final String PW = "Cosc*ymfw";
        final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/cseyou1db";
        
        try
        {
            
            Connection con = DriverManager.getConnection(SERVER,ID,PW);
            Statement stmt = con.createStatement();
            for(int n=0; n < course.size();n++){
                String i = course.get(n);
                if(i.equals(numIN)){
                    check = false;
                    stmt.executeUpdate("INSERT INTO cseyou1db.Students VALUES ('"+TUIDIN+"', '"+first+"', '"+last+"')");
                    stmt.executeUpdate("INSERT INTO cseyou1db.Tutee VALUES ('"+TUIDIN+"')");
                    stmt.executeUpdate("INSERT INTO cseyou1db.Taking VALUES ('"+course.get(n)+"', '"+TUIDIN+"')");
                    JOptionPane.showMessageDialog(null,"Add Tutee","Successful!",JOptionPane.PLAIN_MESSAGE);
                }
            }
            if(check){
                JOptionPane.showMessageDialog(null,"Add Tutee","Unsuccessful!",JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_addTuteeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDIN;
    private javax.swing.JButton addTuteeBtn;
    private javax.swing.JButton addTutorbtn;
    private javax.swing.JTextField courseIN;
    private javax.swing.JTextField firstIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lastIN;
    // End of variables declaration//GEN-END:variables
}
