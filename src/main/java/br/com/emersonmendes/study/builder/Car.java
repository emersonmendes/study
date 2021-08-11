package br.com.emersonmendes.study.builder;

import br.com.emersonmendes.study.entity.Person;

public class Car {

    private Car(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.year = builder.year;
        this.owner = builder.owner;
        this.automatic = builder.automatic;
    }

    private final String name;

    private final String color;

    private final Integer year;

    private final Person owner;

    private final boolean automatic;

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

    public static class Builder {

        private String name;

        private String color;

        private Integer year;

        private Person owner;

        private boolean automatic;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder year(Integer year){
            this.year = year;
            return this;
        }

        public Builder owner(Person owner){
            this.owner = owner;
            return this;
        }

        public Builder automatic(){
            this.automatic = true;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}
