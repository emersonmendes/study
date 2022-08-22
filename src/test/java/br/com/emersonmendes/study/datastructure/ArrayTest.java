package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArrayTest {

    @Test
    public void shouldCreateNewNumbersArray(){
        final int[] newArray = new int[50];
        newArray[30] = 40;
        assertThat(newArray[30]).isEqualTo(40);
        assertThat(newArray.length).isEqualTo(50);
        assertThatThrownBy(() -> { final int number = newArray[51]; })
            .isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("Index 51 out of bounds for length 50");
    }

    @Test
    public void shouldCreateArrayOneToFiveRandomNumbers(){
        final int[] numbers = { 2,3,1,5,4 };
        assertThat(numbers.length).isEqualTo(5);
        assertThat(numbers[0]).isEqualTo(2);
        assertThat(numbers[1]).isEqualTo(3);
        assertThat(numbers[2]).isEqualTo(1);
        assertThat(numbers[3]).isEqualTo(5);
        assertThat(numbers[4]).isEqualTo(4);

        assertThatThrownBy(() -> { final int number = numbers[5]; })
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index 5 out of bounds for length 5");

    }

    @Test
    public void shouldSortNumbersArray(){
        final int[] numbers = { 2,3,1,5,4 };
        assertThat(numbers[0]).isEqualTo(2);
        Arrays.sort(numbers);
        assertThat(numbers[0]).isEqualTo(1);
        assertThat(numbers[1]).isEqualTo(2);
        assertThat(numbers[2]).isEqualTo(3);
        assertThat(numbers[3]).isEqualTo(4);
        assertThat(numbers[4]).isEqualTo(5);
    }

    @Test
    public void shouldFindRepeatingAndMissingElement(){

        final int[] numbers = { 1, 10, 11, 12,12, 17};

        printTwoElements(numbers);

    }


    static void printTwoElements(int arr[]){

        Map<Integer, Boolean> numberMap = new HashMap<>();

        for (int i : arr) {
            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                System.out.println("Repeating = " + i);
            }
        }

        for (int i = 1; i <=  arr.length; i++) {
            if (numberMap.get(i) == null) {
                System.out.println("Missing = " + i);
            }
        }

    }

    @Test
    void any() {
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());


    }
}
