package br.com.emersonmendes.study.algo;

public class Other {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if(i % 5 == 0 || i % 3 == 0){
                count += i;
            }
        }

        System.out.println(count);

    }

}
