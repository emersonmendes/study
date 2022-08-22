package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class StackTest {

    @Test
    void shouldTestStack() {

        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        while (!s.empty()){
            System.out.println(s.pop());
        }

    }

}
