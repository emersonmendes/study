package br.com.emersonmendes.study.designpattern.fluentapi;

public class Subway {

    Subway(int size, String bread, String meat, String cheese, boolean heated, String salad, String sauce) {
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.heated = heated;
        this.salad = salad;
        this.sauce = sauce;
    }

    private final int size;

    private final String bread;

    private final String meat;

    private final String cheese;

    private final boolean heated;

    private final String salad;

    private final String sauce;

    public int getSize() {
        return size;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public boolean isHeated() {
        return heated;
    }

    public String getSalad() {
        return salad;
    }

    public String getSauce() {
        return sauce;
    }

    public static SubwayFluent.SubwayBread size(int size){
        return SubwayFluent.size(size);
    }

}
