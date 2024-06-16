
package Viwe;


import Model.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class ttowenty extends javax.swing.JFrame {

     Connection conn = null;
    PreparedStatment pst = null;
     JTable tablet;
     ResultSet rs = null;
    
    public ttowenty() {
        this.rs = null;
        initComponents();
        conn = DBconect.connect();
         tto();
        
        
        
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTextField46 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        toindex = new javax.swing.JTextField();
        toname = new javax.swing.JTextField();
        tomatch = new javax.swing.JTextField();
        torun = new javax.swing.JTextField();
        towickets = new javax.swing.JTextField();
        tojn = new javax.swing.JTextField();
        tostrike = new javax.swing.JTextField();
        toavg = new javax.swing.JTextField();
        tobest = new javax.swing.JTextField();
        toselect = new javax.swing.JComboBox<>();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablettt = new javax.swing.JTable();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 0));
        jLabel13.setText("HC CRICKET DETAILS FORM");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 280, 30));

        jLabel18.setBackground(new java.awt.Color(153, 51, 0));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 0));
        jLabel18.setText("TEST CRICKET");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("ENTER PLAYER NAME");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("INDEX NUMBER");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 255));
        jLabel16.setText("SELECT YOUR FROMAT");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("MATCHES");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("RUNS");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("WICKETS");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("JURSCY NUMBER");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("STRIKE RATE");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 255));
        jLabel24.setText("AVARAGE");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 255));
        jLabel25.setText("BEST");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 40));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 960, 480));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 960, 430));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 140, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 140, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("ODI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("T20");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 110, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 255));
        jButton3.setText("SUBMIT");
        jButton3.setActionCommand("");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("UPDATE");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 51, 255));
        jButton5.setText("DELETE");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 204, 0));
        jLabel26.setText("HC CRICKET DETAILS FORM");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 280, 30));

        jLabel27.setBackground(new java.awt.Color(153, 51, 0));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 0));
        jLabel27.setText("TEST CRICKET");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setText("ENTER PLAYER NAME");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("INDEX NUMBER");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 30));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 0, 255));
        jLabel30.setText("SELECT YOUR FROMAT");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 255));
        jLabel31.setText("MATCHES");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("RUNS");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 255));
        jLabel33.setText("WICKETS");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 255));
        jLabel34.setText("JURSCY NUMBER");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 255));
        jLabel35.setText("STRIKE RATE");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 255));
        jLabel36.setText("AVARAGE");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 255));
        jLabel37.setText("BEST");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 40));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 960, 480));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 960, 430));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, -1));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 140, -1));

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 140, -1));

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, -1));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("ODI");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, -1));

        jButton7.setBackground(new java.awt.Color(153, 255, 153));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("T20");
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 110, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 204));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 0, 255));
        jButton8.setText("SUBMIT");
        jButton8.setActionCommand("");
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 255, 204));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 51, 255));
        jButton9.setText("UPDATE");
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 204));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 51, 255));
        jButton10.setText("DELETE");
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        jPanel7.setBackground(new java.awt.Color(102, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 204, 0));
        jLabel38.setText("HC CRICKET DETAILS FORM");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 280, 30));

        jLabel39.setBackground(new java.awt.Color(153, 51, 0));
        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 0));
        jLabel39.setText("TEST CRICKET");
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 255));
        jLabel40.setText("ENTER PLAYER NAME");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 255));
        jLabel41.setText("INDEX NUMBER");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 30));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 0, 255));
        jLabel42.setText("SELECT YOUR FROMAT");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 255));
        jLabel43.setText("MATCHES");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("RUNS");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 255));
        jLabel45.setText("WICKETS");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 255));
        jLabel46.setText("JURSCY NUMBER");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 255));
        jLabel47.setText("STRIKE RATE");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 255));
        jLabel48.setText("AVARAGE");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 255));
        jLabel49.setText("BEST");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 960, 480));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 960, 430));

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, -1));

        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 140, -1));

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));
        jPanel7.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));
        jPanel7.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 140, -1));

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, -1));

        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, -1));

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        jButton11.setBackground(new java.awt.Color(255, 255, 102));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 0, 0));
        jButton11.setText("ODI");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, -1));

        jButton12.setBackground(new java.awt.Color(153, 255, 153));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 0, 0));
        jButton12.setText("T20");
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 110, -1));

        jButton13.setBackground(new java.awt.Color(255, 255, 204));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 0, 255));
        jButton13.setText("SUBMIT");
        jButton13.setActionCommand("");
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton14.setBackground(new java.awt.Color(255, 255, 204));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 51, 255));
        jButton14.setText("UPDATE");
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jButton15.setBackground(new java.awt.Color(255, 255, 204));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(102, 51, 255));
        jButton15.setText("DELETE");
        jPanel7.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 560));

        jPanel11.setBackground(new java.awt.Color(102, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 204, 0));
        jLabel62.setText("HC CRICKET DETAILS FORM");
        jPanel11.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 280, 30));

        jLabel63.setBackground(new java.awt.Color(153, 51, 0));
        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 0));
        jLabel63.setText("TEST CRICKET");
        jPanel11.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, -1));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 255));
        jLabel64.setText("ENTER PLAYER NAME");
        jPanel11.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 255));
        jLabel65.setText("INDEX NUMBER");
        jPanel11.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 30));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 0, 255));
        jLabel66.setText("SELECT YOUR FROMAT");
        jPanel11.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 255));
        jLabel67.setText("MATCHES");
        jPanel11.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 255));
        jLabel68.setText("RUNS");
        jPanel11.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 255));
        jLabel69.setText("WICKETS");
        jPanel11.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 255));
        jLabel70.setText("JURSCY NUMBER");
        jPanel11.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 255));
        jLabel71.setText("STRIKE RATE");
        jPanel11.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, -1));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 255));
        jLabel72.setText("AVARAGE");
        jPanel11.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, -1));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 255));
        jLabel73.setText("BEST");
        jPanel11.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 40));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel12.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 960, 480));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 960, 430));

        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, -1));

        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));

        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 140, -1));

        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));
        jPanel11.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));
        jPanel11.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 140, -1));

        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, -1));

        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, -1));

        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, -1));

        jComboBox5.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        jButton21.setBackground(new java.awt.Color(255, 255, 102));
        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 0, 0));
        jButton21.setText("ODI");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, -1));

        jButton22.setBackground(new java.awt.Color(153, 255, 153));
        jButton22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 0, 0));
        jButton22.setText("T20");
        jPanel11.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 110, -1));

        jButton23.setBackground(new java.awt.Color(255, 255, 204));
        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(51, 0, 255));
        jButton23.setText("SUBMIT");
        jButton23.setActionCommand("");
        jPanel11.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton24.setBackground(new java.awt.Color(255, 255, 204));
        jButton24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(51, 51, 255));
        jButton24.setText("UPDATE");
        jPanel11.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jButton25.setBackground(new java.awt.Color(255, 255, 204));
        jButton25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(102, 51, 255));
        jButton25.setText("DELETE");
        jPanel11.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        jPanel9.setBackground(new java.awt.Color(102, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 204, 0));
        jLabel50.setText("HC CRICKET DETAILS FORM");
        jPanel9.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 280, 30));

        jLabel51.setBackground(new java.awt.Color(153, 51, 0));
        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 0));
        jLabel51.setText("TEST CRICKET");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, -1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 255));
        jLabel52.setText("ENTER PLAYER NAME");
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 255));
        jLabel53.setText("INDEX NUMBER");
        jPanel9.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 30));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 0, 255));
        jLabel54.setText("SELECT YOUR FROMAT");
        jPanel9.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 255));
        jLabel55.setText("MATCHES");
        jPanel9.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 255));
        jLabel56.setText("RUNS");
        jPanel9.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 255));
        jLabel57.setText("WICKETS");
        jPanel9.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 255));
        jLabel58.setText("JURSCY NUMBER");
        jPanel9.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 255));
        jLabel59.setText("STRIKE RATE");
        jPanel9.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 255));
        jLabel60.setText("AVARAGE");
        jPanel9.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 255));
        jLabel61.setText("BEST");
        jPanel9.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 40));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 960, 480));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 960, 430));

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, -1));

        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));

        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 140, -1));

        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));
        jPanel9.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));
        jPanel9.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 140, -1));

        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, -1));

        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, -1));

        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        jButton16.setBackground(new java.awt.Color(255, 255, 102));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 0, 0));
        jButton16.setText("ODI");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, -1));

        jButton17.setBackground(new java.awt.Color(153, 255, 153));
        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 0, 0));
        jButton17.setText("T20");
        jPanel9.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 110, -1));

        jButton18.setBackground(new java.awt.Color(255, 255, 204));
        jButton18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(51, 0, 255));
        jButton18.setText("SUBMIT");
        jButton18.setActionCommand("");
        jPanel9.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton19.setBackground(new java.awt.Color(255, 255, 204));
        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 51, 255));
        jButton19.setText("UPDATE");
        jPanel9.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jButton20.setBackground(new java.awt.Color(255, 255, 204));
        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(102, 51, 255));
        jButton20.setText("DELETE");
        jPanel9.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("ENTER PLAYER NAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("INDEX NUMBER");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("SELECT YOUR FROMAT");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("BEST");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("AVARAGE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("STRIKE RATE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("JURSCY NUMBER");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("WICKETS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("RUNS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("MATCHES");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        toindex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toindexActionPerformed(evt);
            }
        });
        jPanel2.add(toindex, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 150, -1));

        toname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonameActionPerformed(evt);
            }
        });
        jPanel2.add(toname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 150, -1));

        tomatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatchActionPerformed(evt);
            }
        });
        jPanel2.add(tomatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, -1));

        torun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torunActionPerformed(evt);
            }
        });
        jPanel2.add(torun, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 150, -1));

        towickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                towicketsActionPerformed(evt);
            }
        });
        jPanel2.add(towickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 150, -1));

        tojn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tojnActionPerformed(evt);
            }
        });
        jPanel2.add(tojn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, -1));

        tostrike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tostrikeActionPerformed(evt);
            }
        });
        jPanel2.add(tostrike, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 150, -1));

        toavg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toavgActionPerformed(evt);
            }
        });
        jPanel2.add(toavg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 150, -1));

        tobest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tobestActionPerformed(evt);
            }
        });
        jPanel2.add(tobest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, -1));

        toselect.setBackground(new java.awt.Color(255, 0, 204));
        toselect.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        toselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "BATSMAN", "BOWLLER", "ALLROUNDER" }));
        jPanel2.add(toselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 130, -1));

        jButton26.setBackground(new java.awt.Color(204, 255, 204));
        jButton26.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(51, 0, 204));
        jButton26.setText("SUBMIT");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jButton27.setBackground(new java.awt.Color(204, 255, 204));
        jButton27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton27.setText("UPDATE");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        jButton28.setBackground(new java.awt.Color(204, 255, 204));
        jButton28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(51, 51, 255));
        jButton28.setText("DELETE");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, -1));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablettt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablettt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletttMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablettt);

        jPanel13.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 380));

        jLabel75.setText("jLabel75");
        jPanel13.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel76.setText("jLabel76");
        jPanel13.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 276, -1, 60));

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 760, 380));

        jLabel17.setBackground(new java.awt.Color(153, 51, 0));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 0));
        jLabel17.setText("T20 CRICKET");
        jPanel14.add(jLabel17);

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 430, 570));
        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -40, -1, -1));
        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -30, -1, -1));

        jPanel17.setBackground(new java.awt.Color(51, 0, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HC CRICKET DETAILS FORM");
        jPanel17.add(jLabel6);

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 60));

        jPanel18.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/sri lanka.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 110, 120));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/images123-removebg-preview.png"))); // NOI18N
        jLabel74.setText("jLabel74");
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 620, -1, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/images123-removebg-preview.png"))); // NOI18N
        jLabel77.setText("jLabel77");
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 190, 140));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/sss.png"))); // NOI18N
        jLabel78.setText("jLabel78");
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 110, -1));

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton29.setText("GO TO HOME");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 810));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 810));

        setSize(new java.awt.Dimension(1226, 705));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void tto(){
     
      try { 
            String sql ="SELECT playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best FROM ttowenty";                                                       
              PreparedStatement pst = conn.prepareStatement(sql);
             rs = (ResultSet) pst.executeQuery();
            tablettt.setModel(DbUtils.resultSetToTableModel(rs));
        
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
     
 
     
       
     
     
       
    }
public void kgdk(){
    int r =tablettt.getSelectedRow();
    
    String name =tablettt.getValueAt(r, 0).toString();
    String ind =tablettt.getValueAt(r, 2).toString();
    String select =tablettt.getValueAt(r, 0).toString();
    String match =tablettt.getValueAt(r, 0).toString();
    String runs =tablettt.getValueAt(r, 0).toString();
    String wickets =tablettt.getValueAt(r, 0).toString();
    String jn =tablettt.getValueAt(r, 0).toString();
    String sta =tablettt.getValueAt(r, 0).toString();
    String avg=tablettt.getValueAt(r, 0).toString();
    String best =tablettt.getValueAt(r, 0).toString();
    
    toname.setText(name);
    toindex.setText(ind);
    toselect.setSelectedItem(select);
    tomatch.setText(match);
    torun.setText(runs);
    towickets.setText(wickets);
    tojn.setText(jn);
    tostrike.setText(sta);
    toavg.setText(avg);
    tobest.setText(best);
            
    
}
 @SuppressWarnings("unchecked")
 
 public void towenntyt (){
      int selectedRow = tablettt.getSelectedRow();
    
    // Ensure a row is selected
    if (selectedRow == -1) {
        // No row is selected, handle this case
        System.out.println("No row selected");
        return;
    }
    
    // Retrieve and store values from the selected row
    String name = tablettt.getValueAt(selectedRow, 0).toString();
    String index = tablettt.getValueAt(selectedRow, 1).toString();
    String select = tablettt.getValueAt(selectedRow, 2).toString();
    String match = tablettt.getValueAt(selectedRow, 3).toString();
    String runs = tablettt.getValueAt(selectedRow, 4).toString();
    String wickets = tablettt.getValueAt(selectedRow, 5).toString();
    String jn = tablettt.getValueAt(selectedRow, 6).toString();
    String status = tablettt.getValueAt(selectedRow, 7).toString();
    String average = tablettt.getValueAt(selectedRow, 8).toString();
    String best = tablettt.getValueAt(selectedRow, 9).toString();
    
    
    toname.setText(name);
    toindex.setText(index);
    toselect.setSelectedItem(select);
   tomatch.setText(match);
    torun.setText(runs);
    towickets.setText(wickets);
   tojn.setText(jn);
    tostrike.setText(status);
    toavg.setText(average);
    tobest.setText(best);
     
 }
 
   private void tabaledatatt() {
    String name = toname.getText();
    String index = toindex.getText();
    String role = toselect.getSelectedItem().toString();
    String match = tomatch.getText();
    String run = torun.getText();
    String wicket = towickets.getText();
    String js = tojn.getText();
    String sr = tostrike.getText();
    String avg = toavg.getText();
    String best = tobest.getText();

    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        // Check if the record exists before attempting the update
        String checkSql = "SELECT COUNT(*) FROM odicricket WHERE indexnumber = ?";
        pst = conn.prepareStatement(checkSql);
        pst.setString(1, index);
        rs = pst.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            // If record exists, proceed with the update
            String sql = "UPDATE ttowenty SET playername = ?, indexnumber = ?, role = ?, matches = ?, runs = ?, wickets = ?, jurscynubmer = ?, strikerate = ?, avarage = ?, best = ? WHERE indexnumber = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, index);
            pst.setString(3, role);
            pst.setString(4, match);
            pst.setString(5, run);
            pst.setString(6, wicket);
            pst.setString(7, js);
            pst.setString(8, sr);
            pst.setString(9, avg);
            pst.setString(10, best);
            pst.setString(11, index);  // Assuming the indexnumber is the unique identifier for the row

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Update failed: No matching record found");
            }
        } else {
            // No matching record found
            JOptionPane.showMessageDialog(null, "No matching record found with the index number: " + index);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
        }
    }
}
       private void tabaledatat(){
    String name = toname.getText();
String index = toindex.getText();
String role = toselect.getSelectedItem().toString();
String match = tomatch.getText();
String run = torun.getText();
String wicket = towickets.getText();
String js = tojn.getText();
String sr = tostrike.getText();
String avg = toavg.getText();
String best = tobest.getText();

PreparedStatement pst = null;
ResultSet rs = null;

try {
    // Check if the record exists before attempting the update
    String checkSql = "SELECT COUNT(*) FROM ttowenty WHERE indexnumber = ?";
    pst = conn.prepareStatement(checkSql);
    pst.setString(1, index);
    rs = pst.executeQuery();

    if (rs.next() && rs.getInt(1) > 0) {
        // If record exists, proceed with the update
        rs.close(); // Close the ResultSet before reusing the PreparedStatement

        String sql = "UPDATE ttowenty SET playername = ?, role = ?, matches = ?, runs = ?, wickets = ?, jurscynubmer = ?, strikerate = ?, avarage = ?, best = ? WHERE indexnumber = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, role);
        pst.setString(3, match);
        pst.setString(4, run);
        pst.setString(5, wicket);
        pst.setString(6, js);
        pst.setString(7, sr);
        pst.setString(8, avg);
        pst.setString(9, best);
        pst.setString(10, index);  // Set the indexnumber for the WHERE clause
        

        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Updated successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Update failed: No matching record found");
        }
    } else {
        // No matching record found
        JOptionPane.showMessageDialog(null, "No matching record found " + index);
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
} finally {
    try {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
    }
}
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void toindexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toindexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toindexActionPerformed

    private void tonameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tonameActionPerformed

    private void tomatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tomatchActionPerformed

    private void torunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_torunActionPerformed

    private void towicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_towicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_towicketsActionPerformed

    private void tojnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tojnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tojnActionPerformed

    private void tostrikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tostrikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tostrikeActionPerformed

    private void toavgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toavgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toavgActionPerformed

    private void tobestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tobestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tobestActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
                  
    
    
     String player = toname.getText();
    String index = toindex.getText();
    String format = (String) toselect.getSelectedItem();
    int matches = Integer.parseInt(tomatch.getText());
    int runs = Integer.parseInt(torun.getText());
    int wickets = Integer.parseInt(towickets.getText());
    int juracy = Integer.parseInt(tojn.getText());
    int strike = Integer.parseInt(tostrike.getText());
    int avg = Integer.parseInt(toavg.getText());
    int best = Integer.parseInt(tobest.getText()); 
    
         try {
        String sql = "INSERT INTO ttowenty (playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, player);
        pst.setString(2, index);
        pst.setString(3, format);
        pst.setInt(4, matches);
        pst.setInt(5, runs);
        pst.setInt(6, wickets);
        pst.setInt(7, juracy);
        pst.setInt(8, strike);
        pst.setInt(9, avg);
        pst.setInt(10, best);
        
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Data inserted successfully!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
          tto();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
tabaledatat();     
      tto();
   
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
                   {                                        
 int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
    if(check == JOptionPane.YES_OPTION){
        String ind = toindex.getText();
        try {
            String sql = "DELETE FROM ttowenty WHERE indexnumber = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, ind);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }
    }
                      tto();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
       login layiya = new login();
       layiya.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void tabletttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletttMouseClicked
        towenntyt ();
    }//GEN-LAST:event_tabletttMouseClicked

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
            java.util.logging.Logger.getLogger(ttowenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ttowenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ttowenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ttowenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ttowenty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tablettt;
    private javax.swing.JTextField toavg;
    private javax.swing.JTextField tobest;
    private javax.swing.JTextField toindex;
    private javax.swing.JTextField tojn;
    private javax.swing.JTextField tomatch;
    private javax.swing.JTextField toname;
    private javax.swing.JTextField torun;
    private javax.swing.JComboBox<String> toselect;
    private javax.swing.JTextField tostrike;
    private javax.swing.JTextField towickets;
    // End of variables declaration//GEN-END:variables
}
 
