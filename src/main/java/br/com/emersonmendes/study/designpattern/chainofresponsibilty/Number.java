package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

class Number {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public static Number of(int number) {
        return new Number(number);
    }

    public int getNumber() {
        return number;
    }

}