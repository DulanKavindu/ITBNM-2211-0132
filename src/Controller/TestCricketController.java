package Controller;

import Model.TestCricketModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class TestCricketController {
    private final TestCricketModel model;

    public TestCricketController() {
        this.model = new TestCricketModel();
    }

    public void populateTable(JTable table) {
        ResultSet rs = model.fetchData();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }

    public void updateData(String name, String index, String role, int matches, int runs, int wickets,
            int jurscynumber, int strikerate, int average, int best) {
        boolean success = model.updateData(name, index, role, matches, runs, wickets, jurscynumber, strikerate,
                average, best);
        if (success) {
            JOptionPane.showMessageDialog(null, "Updated successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Update failed: No matching record found");
        }
    }

    public void insertData(String name, String index, String role, int matches, int runs, int wickets,
            int jurscynumber, int strikerate, int average, int best) {
        boolean success = model.insertData(name, index, role, matches, runs, wickets, jurscynumber, strikerate,
                average, best);
        if (success) {
            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Insertion failed");
        }
    }

    public void deleteData(String index) {
        boolean success = model.deleteData(index);
        if (success) {
            JOptionPane.showMessageDialog(null, "Delete successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Deletion failed");
        }
    }
}
