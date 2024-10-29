package GUI;

// Class imports
import Logic.DataFilter;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

public class FilterPanel {

    ArrayList<JCheckBox> filters;

    public FilterPanel(DataFilter[] filterSet) {

        filters = new ArrayList<>();
        Arrays.stream(filterSet)
                .map(DataFilter::getFilterName)
                .map(s -> new JCheckBox(s))
                .forEach(jCheckBox -> filters.add(jCheckBox));

    }

}
