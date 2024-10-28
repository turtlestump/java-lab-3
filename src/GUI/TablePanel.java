package GUI;

// Class imports
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class TablePanel extends JPanel {

    JScrollPane scrollPane;     // For table navigation
    JTable table;               // For displaying the dataset
    JPanel filterPanel;         // For disabling certain categories
    JCheckBox filters;

    public TablePanel(TableModel data) {

        // Set background.
        setBackground(Color.BLACK);

        // Set table size.
        setPreferredSize(new Dimension(1800, 700));

        // Set filter panel background / size.
        filterPanel = new JPanel();
        filterPanel.setBackground(Color.GRAY);
        filterPanel.setPreferredSize(new Dimension(1800, 280));

        table = new JTable();
        table.setModel(data);           // Fill table with data to create the model.

        // Link table to scroll pane.
        scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(1780, 690));
        table.setFillsViewportHeight(true);

        // *** RESIZE COLUMNS *** -- come back
        for (int i = 0; i < table.getColumnCount(); i++) {

            TableColumn column = table.getColumnModel().getColumn(i);
            column.sizeWidthToFit();

        }

        // Add filter and scroll pane.
        add(filterPanel);
        add(scrollPane);

    }

}
