package br.com.emersonmendes.study.other.defaultmethods;

public interface InterfaceB {

    default void doSomething(){
        System.out.println("Called InterfaceB doSomething");
    }

}
