package br.com.emersonmendes.study.other.defaultmethods;

public class MyClass implements InterfaceA, InterfaceB {


    @Override
    public void doSomething() {
        InterfaceA.super.doSomething();
        InterfaceB.super.doSomething();
    }
}
