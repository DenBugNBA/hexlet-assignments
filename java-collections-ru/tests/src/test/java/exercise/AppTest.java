package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> numbers;
    @BeforeEach
    void prepare() {
        this.numbers = new ArrayList<>();
    }

    @Test
    void takeTest1() {
        this.numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(Arrays.asList(1, 2), App.take(numbers, 2));
    }

    @Test
    void takeTest2() {
        this.numbers = new ArrayList<>(Arrays.asList(7, 3, 10));
        Assertions.assertEquals(Arrays.asList(7, 3, 8), App.take(numbers, 2));
    }

    @Test
    void take_negativeCountTest() {
        this.numbers = new ArrayList<>(Arrays.asList(7, 3, 10));
        Assertions.assertEquals(List.of(), App.take(numbers, -1));
    }

    @Test
    void take_emptyListTest() {
        int listSize = App.take(this.numbers, 2).size();
        Assertions.assertEquals(0, listSize);
    }
}
