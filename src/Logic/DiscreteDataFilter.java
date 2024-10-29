package Logic;

// Class imports
import java.util.Arrays;
import java.util.function.Predicate;

// This class will govern filters that work on enum values.
public class DiscreteDataFilter<T> implements DataFilter<T> {

    T inflectionPoint;

    public DiscreteDataFilter(T inflectionPoint) {

        this.inflectionPoint = inflectionPoint;

    }

    @Override
    public Predicate<T> getFilter() {

        return T -> T.equals(inflectionPoint);

    }

    @Override
    public String getFilterName() {

        return inflectionPoint.toString();

    }

    public static <T> DiscreteDataFilter[] getFilterSet(T[] values) {

        return Arrays.stream(values)
                .map(DiscreteDataFilter<T>::new)
                .toArray(DiscreteDataFilter[]::new);

    }
}
