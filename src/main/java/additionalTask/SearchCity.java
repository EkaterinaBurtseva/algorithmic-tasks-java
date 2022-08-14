package additionalTask;

import java.util.List;
import java.util.stream.Collectors;

public class SearchCity {


    public static List<String> search(List<City> cities, String keyword) {
        return cities.parallelStream()
                .filter(city -> city.getDescription().contains(keyword))
                .map(City::getName)
                .collect(Collectors.toList());
    }
}
