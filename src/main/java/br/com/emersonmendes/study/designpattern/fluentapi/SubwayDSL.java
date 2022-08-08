package br.com.emersonmendes.study.designpattern.fluentapi;

public class SubwayDSL implements
    SubwayFluent.SubwayBread,
        SubwayFluent.SubwayMeat,
        SubwayFluent.SubwayCheese,
        SubwayFluent.SubwaySalad,
        SubwayFluent.SubwayHeated,
        SubwayFluent.SubwaySauce,
        SubwayFluent.SubwayBuild
{

    private final int size;
    private String bread;
    private String meat;
    private String cheese;
    private boolean heated;
    private String salad;
    private String sauce;

    public SubwayDSL(int size) {
        this.size = size;
    }

    @Override
    public SubwayFluent.SubwayMeat bread(String bread) {
        this.bread = bread;
        return this;
    }

    @Override
    public SubwayFluent.SubwayCheese meat(String meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public SubwayFluent.SubwayHeated cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public SubwayFluent.SubwaySalad heated(boolean heated) {
        this.heated = heated;
        return this;
    }

    @Override
    public SubwayFluent.SubwaySauce salad(String salad) {
        this.salad = salad;
        return this;
    }

    @Override
    public SubwayFluent.SubwayBuild sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public Subway build() {
        return new Subway(size, bread, meat, cheese, heated, salad, sauce);
    }

}
