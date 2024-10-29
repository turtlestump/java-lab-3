package Logic;

import java.util.function.Predicate;

public interface DataFilter<T> {

    Predicate<T> getFilter();
    String getFilterName();

}
