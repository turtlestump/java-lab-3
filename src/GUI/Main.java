package GUI;

// Johnathan Church
// Lab 3: Data Visualization

// Class imports
import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    TablePanel tablePanel;
    ChartPanel chartPanel;
    StatsPanel statsPanel;
    DetailsPanel detailsPanel;

    public Main() {

        setPreferredSize(new Dimension(1920, 1080));
        tablePanel = new TablePanel(new DataModel());
        add(tablePanel);

    }

    public static void main(String[] args) {

        // Open frame.
        JFrame frame = new JFrame();
        frame.setTitle("Data Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Main());
        frame.pack();
        frame.setVisible(true);

    }

}
