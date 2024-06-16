
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class odiModel {
    
    private Connection conn;
    
    public odiModel() {
        conn = DBconect.connect();
    }
    
    public ResultSet getData() {
        ResultSet rs = null;
        try {
            String sql = "SELECT playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best FROM odicricket";
            PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public boolean updateData(String name, String index, String role, int matches, int runs, int wickets, int jurscynubmer, int strikerate, int avarage, int best) {
        boolean success = false;
        PreparedStatement pst = null;
        try {
            String sql = "UPDATE odicricket SET playername = ?, role = ?, matches = ?, runs = ?, wickets = ?, jurscynubmer = ?, strikerate = ?, avarage = ?, best = ? WHERE indexnumber = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, role);
            pst.setInt(3, matches);
            pst.setInt(4, runs);
            pst.setInt(5, wickets);
            pst.setInt(6, jurscynubmer);
            pst.setInt(7, strikerate);
            pst.setInt(8, avarage);
            pst.setInt(9, best);
            pst.setString(10, index);
            
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                success = true;
            } else {
                JOptionPane.showMessageDialog(null, "Update failed: No matching record found");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
        return success;
    }
    
    public boolean insertData(String name, String index, String role, int matches, int runs, int wickets, int jurscynubmer, int strikerate, int avarage, int best) {
        boolean success = false;
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO odicricket (playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, index);
            pst.setString(3, role);
            pst.setInt(4, matches);
            pst.setInt(5, runs);
            pst.setInt(6, wickets);
            pst.setInt(7, jurscynubmer);
            pst.setInt(8, strikerate);
            pst.setInt(9, avarage);
            pst.setInt(10, best);
            
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                success = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
        return success;
    }
    
    public boolean deleteData(String index) {
        boolean success = false;
        PreparedStatement pst = null;
        try {
            String sql = "DELETE FROM odicricket WHERE indexnumber = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, index);
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                success = true;
            } else {
                JOptionPane.showMessageDialog(null, "Delete failed: No matching record found");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
        return success;
    }
}