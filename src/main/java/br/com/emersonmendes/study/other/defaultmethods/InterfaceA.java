package br.com.emersonmendes.study.other.defaultmethods;

public interface InterfaceA {

    default void doSomething(){
        System.out.println("Called InterfaceA doSomething");
    }

}
