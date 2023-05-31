package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        for (Map.Entry<String, String> entry : storage.toMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!storage.get(value, "default").equals("default")) {
                storage.set(storage.get(value, ""), value);
            }

            storage.unset(key);
            storage.set(value, key);
        }
    }
}
// END
