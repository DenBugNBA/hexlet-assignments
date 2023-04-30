package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static boolean scrabble(String symbols, String word) {
        List<Character> symbolsList = new ArrayList<>(symbols.length());

        for (int i = 0; i < symbols.length(); i++) {
            char symbol = Character.toLowerCase(symbols.charAt(i));
            symbolsList.add(symbol);
        }

        for (int i = 0; i < word.length(); i++) {
            char symbol = Character.toLowerCase(word.charAt(i));

            if (symbolsList.contains(symbol)) {
                symbolsList.remove(Character.valueOf(symbol));
            } else {
                return false;
            }
        }

        return true;
    }
}
