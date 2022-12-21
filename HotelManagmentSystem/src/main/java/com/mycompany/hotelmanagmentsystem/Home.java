//import java.util.*;
//import java.awt.*;
//import java.awt.event.*;


package com.mycompany.hotelmanagmentsystem;

/**
 * @author HP
 */

public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("                                                                  HOTEL MANAGMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 615, 40));

        jButton1.setText("I AM A CUSTOMER");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 47));

        jButton2.setText("I AM AN EMPLOYEE");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 47));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); 
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("HOTEL KETASRU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 210, 28));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\MISC\\home_img.jpg")); 
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 310));
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      Customer p= new Customer();
      p.show();
      dispose();
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Employee_Login e=new Employee_Login();
        e.show();
        dispose();
    }

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new Home().setVisible(true);
        }
       });
    }
       
    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
}
