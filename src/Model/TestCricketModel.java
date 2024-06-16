package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TestCricketModel {
    private Connection conn;

    public TestCricketModel() {
        this.conn = DBconect.connect(); // Ensure your DBConnect class provides a valid connection
    }

    public ResultSet fetchData() {
        ResultSet rs = null;
        try {
            String sql = "SELECT playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best FROM testcricket";
            PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }

    public boolean updateData(String name, String index, String role, int matches, int runs, int wickets,
            int jurscynumber, int strikerate, int average, int best) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean success = false;

        try {
            String checkSql = "SELECT COUNT(*) FROM testcricket WHERE indexnumber = ?";
            pst = conn.prepareStatement(checkSql);
            pst.setString(1, index);
            rs = pst.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                rs.close();

                String sql = "UPDATE testcricket SET playername = ?, role = ?, matches = ?, runs = ?, wickets = ?, jurscynubmer = ?, strikerate = ?, avarage = ?, best = ? WHERE indexnumber = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, role);
                pst.setInt(3, matches);
                pst.setInt(4, runs);
                pst.setInt(5, wickets);
                pst.setInt(6, jurscynumber);
                pst.setInt(7, strikerate);
                pst.setInt(8, average);
                pst.setInt(9, best);
                pst.setString(10, index);

                int rowsUpdated = pst.executeUpdate();
                if (rowsUpdated > 0) {
                    success = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (pst != null)
                    pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }

        return success;
    }

    public boolean insertData(String name, String index, String role, int matches, int runs, int wickets,
            int jurscynumber, int strikerate, int average, int best) {
        PreparedStatement pst = null;
        boolean success = false;

        try {
            String sql = "INSERT INTO testcricket (playername, indexnumber, role, matches, runs, wickets, jurscynubmer, strikerate, avarage, best) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, index);
            pst.setString(3, role);
            pst.setInt(4, matches);
            pst.setInt(5, runs);
            pst.setInt(6, wickets);
            pst.setInt(7, jurscynumber);
            pst.setInt(8, strikerate);
            pst.setInt(9, average);
            pst.setInt(10, best);

            pst.executeUpdate();
            success = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (pst != null)
                    pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }

        return success;
    }

    public boolean deleteData(String index) {
        PreparedStatement pst = null;
        boolean success = false;

        try {
            String sql = "DELETE FROM testcricket WHERE indexnumber = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, index);

            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                success = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        } finally {
            try {
                if (pst != null)
                    pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }

        return success;
    }
}
