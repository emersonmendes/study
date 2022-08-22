package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    void shouldTestQueue() {

        Queue<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        while (!ll.isEmpty()){
            System.out.println(ll.poll());
        }

    }

}
