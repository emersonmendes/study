package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SuffixTreeTest {

    @Test
    void shouldDoASearchForAValidPath() {

        SuffixTree suffixTree = new SuffixTree("havanabanana");

        List<String> matches = suffixTree.searchText("na");
        matches.forEach(System.out::println);

        Assertions.assertEquals(matches.size(), 3);


    }
}