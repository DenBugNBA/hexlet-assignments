package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> !email.isEmpty())
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("yandex.ru") || email.endsWith("hotmail.com"))
                .count();
    }
}
// END
