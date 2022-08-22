package br.com.emersonmendes.study.other.comparate;

public class Person implements Comparable<Person> {

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

}
