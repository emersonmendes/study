package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

public record Number(int number) {

    public static Number of(int number) {
        return new Number(number);
    }

}