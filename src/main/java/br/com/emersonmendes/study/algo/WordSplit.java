package br.com.emersonmendes.study.algo;

import java.util.HashSet;
import java.util.Set;

public class WordSplit {

    public static String wordSplit(String[] strArr) {

        String word = strArr[0];
        String[] dictArr = strArr[1].split(",");
        Set<String> dict = new HashSet<>();

        for (String w : dictArr) {
            dict.add(w.trim());
        }

        for (String w : dict) {
            if (word.startsWith(w)) {
                String rem = word.substring(w.length());
                if (dict.contains(rem)) {
                    return w + "," + rem;
                }
            }
        }

        return "not possible";

    }

    public static void main(String[] args) {
        String[] input1 = { "hellocat", "apple,bat,cat,goodbye,hello,yellow,why" };
        System.out.println(wordSplit(input1));

        String[] input2 = {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        System.out.println(wordSplit(input2));
    }

}
