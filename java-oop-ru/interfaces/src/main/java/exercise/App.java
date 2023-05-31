package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> estateObjects, int n) {
        return estateObjects.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .limit(n)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END
