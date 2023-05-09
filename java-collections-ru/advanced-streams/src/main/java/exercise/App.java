package exercise;

import java.util.StringJoiner;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String content) {
        StringJoiner sj = new StringJoiner(",");

        String[] lines = content.split("\n");

        Arrays.stream(lines)
                .filter((line) -> line.startsWith("environment"))
                .map((line) -> line.substring(13, line.length() - 1))
                .map((line) -> line.split(","))
                .flatMap(Stream::of)
                .filter((record) -> record.startsWith("X_FORWARDED_"))
                .map((record) -> record.replace("X_FORWARDED_", ""))
                .forEach(sj::add);

        return sj.toString();
    }
}
//END
