package Logic;

// Class imports
import javax.swing.table.TableModel;

public interface FilterableTableModel extends TableModel {

    DataFilter[][] getFilterSets();

}
