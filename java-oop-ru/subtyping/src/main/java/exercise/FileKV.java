package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV implements KeyValueStorage {
    String path;
    public FileKV (String path, Map<String, String> stringMap){
        this.path = path;
        stringMap.entrySet()
                .stream()
                .forEach((entry) -> set(entry.getKey(), entry.getValue()));
    }

    public void set(String key, String value) {
        String data = Utils.readFile(path);
        Map<String, String> stringMap = Utils.unserialize(data);
        stringMap.put(key, value);
        Utils.writeFile(path, Utils.serialize(stringMap));
    };

    public void unset(String key) {
        String data = Utils.readFile(path);
        Map<String, String> stringMap = Utils.unserialize(data);
        stringMap.remove(key);
        Utils.writeFile(path, Utils.serialize(stringMap));
    }

    public String get(String key, String defaultValue) {
        String data = Utils.readFile(path);
        Map<String, String> stringMap = Utils.unserialize(data);
        return stringMap.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        String data = Utils.readFile(path);
        Map<String, String> stringMap = Utils.unserialize(data);
        return new HashMap<>(stringMap);
    }


}
// END
