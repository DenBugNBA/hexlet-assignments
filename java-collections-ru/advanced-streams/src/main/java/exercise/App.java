package exercise;

import java.util.StringJoiner;
import java.util.stream.Collectors;
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

    public static void main(String[] args) {
        String file = "[program:prepare]\n" +
                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'\n" +
                "autorestart=false\n" +
                "environment=\"X_FORWARDED_MAIL=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en\"\n" +
                "\n" +
                "[program:http_server]\n" +
                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make environment'\n" +
                "environment=\"key5=value5,X_FORWARDED_var3=value,key6=value6\"";

        System.out.println(getForwardedVariables(file));
    }
}
//END
