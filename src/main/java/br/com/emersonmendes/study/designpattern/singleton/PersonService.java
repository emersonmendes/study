package br.com.emersonmendes.study.designpattern.singleton;

public class PersonService {

    private static PersonService instance;

    private PersonService() {}

    public static PersonService getInstance(){
        if(instance == null){
            instance = new PersonService();
        }
        return instance;
    }

    public String doSomething(){
        return "Something!";
    }

}
