package br.com.emersonmendes.study.enums;

import java.util.function.BiFunction;

public enum Operation {

    PLUS(Double::sum),
    MINUS((a, b) -> a - b),
    TIMES((a, b) -> a * b);

    private final BiFunction<Double,Double,Double> operation;

    Operation(BiFunction<Double,Double,Double> operation) {
        this.operation = operation;
    }

    public double operate(double valueA, double valueB){
        return this.operation.apply(valueA, valueB);
    }

}
