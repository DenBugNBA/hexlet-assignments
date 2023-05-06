package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> numbers;

    @Test
    void takeTest1() {
        this.numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(Arrays.asList(1, 2), App.take(numbers, 2));
    }

    @Test
    void takeTest2() {
        this.numbers = new ArrayList<>(Arrays.asList(7, 3, 10));
        Assertions.assertEquals(Arrays.asList(7, 3), App.take(numbers, 2));
    }

    @Test
    void takeNegativeCountTest() {
        this.numbers = new ArrayList<>(Arrays.asList(7, 3, 10));
        Assertions.assertEquals(List.of(), App.take(numbers, -1));
    }

    @Test
    void takeEmptyListTest() {
        this.numbers = new ArrayList<>();
        boolean isEmpty = App.take(this.numbers, 2).isEmpty();
        Assertions.assertTrue(isEmpty);
    }
}
