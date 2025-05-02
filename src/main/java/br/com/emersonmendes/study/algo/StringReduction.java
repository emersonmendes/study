package br.com.emersonmendes.study.algo;

public class StringReduction {

    public static void main(String[] args) {
        System.out.println(stringReduction("abcbcba"));
        System.out.println(stringReduction("ababbac"));
        System.out.println(stringReduction("abababaccc"));
    }

    public static int stringReduction(String s) {

        int res = s.length() + 1;

        while (res > s.length()){
            res = s.length();
            s = s.replaceFirst("ab|ba", "c");
            s = s.replaceFirst("ab|ba", "c");
            s = s.replaceFirst("ac|ca", "b");
            s = s.replaceFirst("bc|cb", "a");
        }

        return s.length();

    }


}
