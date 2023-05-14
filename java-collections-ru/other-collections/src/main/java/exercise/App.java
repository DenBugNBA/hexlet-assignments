package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Objects;

// BEGIN
class App {
    public static LinkedHashMap genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> diffMap = new LinkedHashMap<>();

        Set<String> sortedKeys = new TreeSet<>();
        sortedKeys.addAll(map1.keySet());
        sortedKeys.addAll(map2.keySet());

        for (String key: sortedKeys) {
            if (!map1.containsKey(key)) {
                diffMap.put(key, "added");
            } else if (!map2.containsKey(key)) {
                diffMap.put(key, "deleted");
            } else if (!Objects.equals(map1.get(key), map2.get(key))) {
                diffMap.put(key, "changed");
            } else {
                diffMap.put(key, "unchanged");
            }
        }

        return diffMap;
    }
}
//END
