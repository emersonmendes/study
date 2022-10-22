package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.Test;

import java.io.IOException;
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
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ListTest {

    @Test
    public void shouldTestLinkedList(){

        LinkedList<String> linkedList = new LinkedList<>(List.of("apple", "grape", "banana"));

        assertThat(linkedList.get(0)).isEqualTo("apple");
        linkedList.push("orange"); //add to begin
        assertThat(linkedList.get(0)).isEqualTo("orange");
        linkedList.poll(); // remove first element
        assertThat(linkedList.get(0)).isEqualTo("apple");

        String collect = linkedList.stream().sorted().collect(Collectors.joining(", "));

        assertThat(collect).isEqualTo("apple, banana, grape");

    }

    @Test
    public void shouldReverseLinkedList(){

        List<String> ll = new LinkedList<>();

        ll.add("a1");
        ll.add("a2");
        ll.add("a3");
        ll.add("a4");
        ll.add("a5");

        List<String> result = ll.stream().sorted(Comparator.reverseOrder()).toList();

        assertThat(ll.get(4)).isEqualTo("a5");
        assertThat(result.get(4)).isEqualTo("a1");

    }

    @Test
    public void shouldNotGetASyncArrayList() throws Exception {

        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        Instant start = Instant.now();

        final int listSize = 99;

        ExecutorService service = Executors.newFixedThreadPool(listSize);
        CountDownLatch latch = new CountDownLatch(listSize);

        for(int i = 0; i < listSize; i++){
            int finalI = i;
            service.execute(() -> {
                list.add("[ArrayList] Index: " + finalI + " Hash: " + genRandomString());
                latch.countDown();
            });

        }

        latch.await();

        for(String d : list){
            builder.append(d).append("\n");
        }

        assertThat(list.get(3 -1)).doesNotContain("Index: 3 Hash: ");

        Files.write(Paths.get("/home/emerson/Downloads/output.txt"), builder.toString().getBytes());

        showFinalTime(start);

    }

    private String genRandomString() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(20)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }

    private void showFinalTime(Instant start) {
        Instant end = Instant.now();
        final Duration duration = Duration.between(start, end);
        //System.out.println(duration);
        System.out.format(
            "%02dH %02dm %02ds %04dms \n",
            duration.toHours(),
            duration.toMinutes(),
            duration.getSeconds(),
            duration.toMillis()
        );
    }

}
