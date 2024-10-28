package Logic;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.io.IOException;
import java.util.ArrayList;

public class DataModel implements TableModel {

    // Variables / constants
    int rowCount;
    int columnCount;

    // These will represent the selections of columns that will be included in the table.
    final String[] columnNames = {"Hours Studied", "Attendance", "Parental Involvement",
                                  "Hours Slept", "Previous Scores", "Motivation Level", "Teacher Quality",
                                  "School Type", "Learning Disabilities", "Exam Score"};
    final int[] viewColumns = {0, 1, 2,
                               5, 6, 7, 11,
                               12, 15, 19};     // Corresponds to columns above

    ArrayList<TableModelListener> listeners = new ArrayList<>();
    final String fileName = "StudentPerformanceFactors.csv";
    Object[][] data;

    public DataModel() {

        columnCount = columnNames.length;

        try {

            // Create dataset.
            data = FileReader.readData(fileName);

        } catch (IOException e) {

            System.out.println("Error: Could not read file.");

        }

        rowCount = data.length;

    }
    
    @Override
    public int getRowCount() {

        return rowCount;

    }

    @Override
    public int getColumnCount() {

        return columnCount;

    }

    @Override
    public String getColumnName(int columnIndex) {

        return columnNames[columnIndex];

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        return getValueAt(0, columnIndex).getClass();

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return false;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        return data[rowIndex][viewColumns[columnIndex]];

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

}