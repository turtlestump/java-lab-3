package Logic;

import java.util.function.Predicate;

// This class will govern filters that work on numeric values.
public class RangedDataFilter<T extends Comparable<T>> implements DataFilter<T> {

    // This predicates represent the range of values for each filter.
    T min;
    T max;

    public RangedDataFilter(T min, T max) {

        this.min = min;
        this.max = max;

    }

    @Override
    public Predicate<T> getFilter() {

        return d -> (d.compareTo(max) <= 0 && d.compareTo(min) >= 0);

    }

    @Override
    public String getFilterName() {

        return min.toString() + " - " + max.toString();

    }

}
