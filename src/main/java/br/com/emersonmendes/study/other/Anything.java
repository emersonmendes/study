package br.com.emersonmendes.study.other;

public class Anything {

    public static void main(String[] args) {


        System.out.println(new Anything().solution(10,21,31));


    }

    public int solution(int[] A) {
        int current = A[0];
        int counter = 1;

        while (current != -1) {
            current = A[current];
            counter++;
        }

        return counter;
    }

}
