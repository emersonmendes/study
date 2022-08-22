package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {
    @Test
    void shouldTestConcurrentHashMap() {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(2,"a");
        map.put(20,"b");
        map.put(1,"c");
        map.put(14,"a");

        for (Integer key : map.keySet())
            System.out.println(key);
    }


    @Test
    void shouldTestHashMap() {

        Map<Integer, String> map = new HashMap<>();
        map.put(2,"a");
        map.put(20,"b");
        map.put(1,"c");
        map.put(14,"a");

        for (Integer key : map.keySet())
            System.out.println(key);

    }

    @Test
    void shouldTestTreeMap() {

        Map<Integer, String> map = new TreeMap<>();
        map.put(2,"a");
        map.put(20,"b");
        map.put(1,"c");
        map.put(14,"a");

        for (Integer key : map.keySet())
            System.out.println(key);

    }

}
