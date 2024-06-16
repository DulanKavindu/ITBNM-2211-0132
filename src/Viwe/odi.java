

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
import java.sql.DriverManager;
import javax.swing.JFrame;


public class odi extends javax.swing.JFrame {
     Connection conn = null;
    PreparedStatment pst = null;
     JTable table;
     ResultSet rs = null;

    private static void setModel(TableModel resultSetToTableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
     
    
    public odi() {
        this.rs =null;
        initComponents();
      ;
        conn = DBconect.connect();
            odic();
            
            
            
    }
     @SuppressWarnings("unchecked")
    
    public  void odic(){
         try { 
            String sql ="SELECT playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best FROM odicricket";
             PreparedStatement pst = conn.prepareStatement(sql);
             rs = (ResultSet) pst.executeQuery();
            tableo.setModel(DbUtils.resultSetToTableModel(rs));
        
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


private void tabaledata() {
    String name = oname.getText();
    String index = oindex.getText();
    String role = oselect.getSelectedItem().toString();
    String match = omatch.getText();
    String run = oruns.getText();
    String wicket = owickets.getText();
    String js = ojurcy.getText();
    String sr = ostrike.getText();
    String avg = oavg.getText();
    String best = obest.getText();

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
            String sql = "UPDATE odicricket SET playername = ?, indexnumber = ?, role = ?, matches = ?, runs = ?, wickets = ?, jurscynubmer = ?, strikerate = ?, avarage = ?, best = ? WHERE indexnumber = ?";
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


// Example method to get database connection
public static Connection getConnection() {
    // Replace with your database connection logic
    // For example:
    // String url = "jdbc:mysql://localhost:3306/yourdatabase";
    // String user = "username";
    // String password = "password";
    // return DriverManager.getConnection(url, user, password);
    return null; // Placeholder for actual connection logic
}


// Example method to get database connection

        
        
        
    
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        oname = new javax.swing.JTextField();
        oindex = new javax.swing.JTextField();
        oselect = new javax.swing.JComboBox<>();
        omatch = new javax.swing.JTextField();
        oruns = new javax.swing.JTextField();
        owickets = new javax.swing.JTextField();
        ojurcy = new javax.swing.JTextField();
        ostrike = new javax.swing.JTextField();
        oavg = new javax.swing.JTextField();
        obest = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(153, 51, 0));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 0));
        jLabel18.setText("ODI CRICKET");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("ENTER PLAYER NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("INDEX NUMBER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("SELECT YOUR FROMAT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("MATCHES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("RUNS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("WICKETS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("JURSCY NUMBER");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("STRIKE RATE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 150, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("AVARAGE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("BEST");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 80, 40));

        oname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onameActionPerformed(evt);
            }
        });
        jPanel1.add(oname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 150, -1));

        oindex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oindexActionPerformed(evt);
            }
        });
        jPanel1.add(oindex, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 140, -1));

        oselect.setBackground(new java.awt.Color(255, 0, 204));
        oselect.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        oselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "BATSMAN", "BOWLLER", "ALLROUNDER" }));
        jPanel1.add(oselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 130, -1));

        omatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omatchActionPerformed(evt);
            }
        });
        jPanel1.add(omatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 140, -1));

        oruns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orunsActionPerformed(evt);
            }
        });
        jPanel1.add(oruns, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, -1));
        jPanel1.add(owickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 140, -1));
        jPanel1.add(ojurcy, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 140, -1));

        ostrike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ostrikeActionPerformed(evt);
            }
        });
        jPanel1.add(ostrike, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 140, -1));

        oavg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oavgActionPerformed(evt);
            }
        });
        jPanel1.add(oavg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 140, -1));

        obest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obestActionPerformed(evt);
            }
        });
        jPanel1.add(obest, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 150, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        sub.setBackground(new java.awt.Color(204, 255, 204));
        sub.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        sub.setText("SUBMIT");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel1.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, -1));

        tableo.setModel(new javax.swing.table.DefaultTableModel(
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
        tableo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 740, 190));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 410, 530));

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HC CRICKET DETAILS FORM");
        jPanel4.add(jLabel6);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1370, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/sri lanka.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 110, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/images123-removebg-preview.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 190, 140));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/sss.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 120, 110));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("T20");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 110, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("GO TO BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 830));

        setSize(new java.awt.Dimension(1384, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    public void odicticket(){
 
       int selectedRow = tableo.getSelectedRow();
    
    // Ensure a row is selected
    if (selectedRow == -1) {
        // No row is selected, handle this case
        System.out.println("No row selected");
        return;
    }
    
    // Retrieve and store values from the selected row
    String name = tableo.getValueAt(selectedRow, 0).toString();
    String index = tableo.getValueAt(selectedRow, 1).toString();
    String select = tableo.getValueAt(selectedRow, 2).toString();
    String match = tableo.getValueAt(selectedRow, 3).toString();
    String runs = tableo.getValueAt(selectedRow, 4).toString();
    String wickets = tableo.getValueAt(selectedRow, 5).toString();
    String jn = tableo.getValueAt(selectedRow, 6).toString();
    String status = tableo.getValueAt(selectedRow, 7).toString();
    String average = tableo.getValueAt(selectedRow, 8).toString();
    String best = tableo.getValueAt(selectedRow, 9).toString();
    
    
    oname.setText(name);
    oindex.setText(index);
    oselect.setSelectedItem(select);
    omatch.setText(match);
    oruns.setText(runs);
    owickets.setText(wickets);
    ojurcy.setText(jn);
    ostrike.setText(status);
    oavg.setText(average);
    obest.setText(best);
     
       
    }
    private void tabaledatat(){
    String name = oname.getText();
String index = oindex.getText();
String role = oselect.getSelectedItem().toString();
String match = omatch.getText();
String run = oruns.getText();
String wicket = owickets.getText();
String js = ojurcy.getText();
String sr = ostrike.getText();
String avg = oavg.getText();
String best = obest.getText();

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
        rs.close(); // Close the ResultSet before reusing the PreparedStatement

        String sql = "UPDATE odicricket SET playername = ?, role = ?, matches = ?, runs = ?, wickets = ?, jurscynubmer = ?, strikerate = ?, avarage = ?, best = ? WHERE indexnumber = ?";
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
    private void onameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onameActionPerformed

    private void oindexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oindexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oindexActionPerformed

    private void omatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_omatchActionPerformed

    private void orunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orunsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orunsActionPerformed

    private void ostrikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostrikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ostrikeActionPerformed

    private void oavgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oavgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oavgActionPerformed

    private void obestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obestActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
    String player = oname.getText();
    String index = oindex.getText();
    String format = (String) oselect.getSelectedItem();
    int matches = Integer.parseInt(omatch.getText());
    int runs = Integer.parseInt(oruns.getText());
    int wickets = Integer.parseInt(owickets.getText());
    int juracy = Integer.parseInt(ojurcy.getText());
    int strike = Integer.parseInt(ostrike.getText());
    int avg = Integer.parseInt(oavg.getText());
    int best = Integer.parseInt(obest.getText()); 
    
         try {
        String sql = "INSERT INTO odicricket (playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
         odic();
         
    }//GEN-LAST:event_subActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ttowenty akila = new ttowenty();
       akila.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      test kusal = new test();
      kusal.setVisible(true);
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tabaledata ();
        odic();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
    if(check == JOptionPane.YES_OPTION){
        String ind = oindex.getText();
        try {
            String sql = "DELETE FROM odicricket WHERE indexnumber = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, ind);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }
    
           odic();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableoMouseClicked
        odicticket();
        
    }//GEN-LAST:event_tableoMouseClicked

   
    
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
            java.util.logging.Logger.getLogger(odi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(odi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(odi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(odi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new odi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oavg;
    private javax.swing.JTextField obest;
    private javax.swing.JTextField oindex;
    private javax.swing.JTextField ojurcy;
    private javax.swing.JTextField omatch;
    private javax.swing.JTextField oname;
    private javax.swing.JTextField oruns;
    private javax.swing.JComboBox<String> oselect;
    private javax.swing.JTextField ostrike;
    private javax.swing.JTextField owickets;
    private javax.swing.JButton sub;
    private javax.swing.JTable tableo;
    // End of variables declaration//GEN-END:variables

  
}
