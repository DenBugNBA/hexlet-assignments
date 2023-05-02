package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");

        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            if (!Objects.equals(word, "")) {
                wordsCount.putIfAbsent(word, 0);
                wordsCount.replace(word, wordsCount.get(word) + 1);
            }
        }

        return  wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        StringBuilder builder = new StringBuilder();

        builder.append("{");

        if (wordsCount.size() != 0) {
            builder.append("\n");
        }

        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {

            builder.append("  ");
            builder.append(entry.getKey());
            builder.append(": ");
            builder.append(entry.getValue());
            builder.append("\n");
        }

        builder.append("}");

        return  builder.toString();
    }
}
//END
