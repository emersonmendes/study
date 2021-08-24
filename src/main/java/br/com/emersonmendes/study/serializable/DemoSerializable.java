package br.com.emersonmendes.study.serializable;

import java.io.Serializable;

public class DemoSerializable implements Serializable {

    private String name;

    private int age;

    private String something;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

}
