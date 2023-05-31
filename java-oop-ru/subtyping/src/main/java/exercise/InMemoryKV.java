package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> stringMap;

    public InMemoryKV(Map<String, String> stringMap) {
        this.stringMap = new HashMap<>(stringMap);
    }

    @Override
    public void set(String key, String value) {
        this.stringMap.put(key, value);
    }

    @Override
    public void unset(String key) {
        this.stringMap.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return this.stringMap.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.stringMap);
    }
}
// END
