package br.com.emersonmendes.study.builder;

import br.com.emersonmendes.study.entity.Person;

public class Car {

    private Car() {}

    private String name;

    private String color;

    private Integer year;

    private Person owner;

    private boolean automatic;

    public static class Builder {

        private final Integer year;

        private String name;

        private String color;

        private Person owner;

        private boolean automatic;

        public Builder(Integer year) {
            this.year = year;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withColor(String color){
            this.color = color;
            return this;
        }

        public Builder withOwner(Person owner){
            this.owner = owner;
            return this;
        }

        public Builder automatic(){
            this.automatic = true;
            return this;
        }

        public Car build() {
            final Car car = new Car();
            car.name = this.name;
            car.color = this.color;
            car.year = this.year;
            car.owner = this.owner;
            car.automatic = this.automatic;
            return car;
        }

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public Person getOwner() {
        return owner;
    }

    public boolean isAutomatic() {
        return automatic;
    }

}
