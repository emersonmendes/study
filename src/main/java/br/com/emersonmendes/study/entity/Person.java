package br.com.emersonmendes.study.entity;

import java.util.Objects;

public class Person {

    public Person() {}

    public Person(String name, String bloodType, Integer age) {
        this.name = name;
        this.bloodType = bloodType;
        this.age = age;
    }

    private String name;

    private String bloodType;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
            Objects.equals(bloodType, person.bloodType) &&
            Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bloodType, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", age=" + age +
                '}';
    }



}
