package br.com.emersonmendes.study.solid._5dependencyinversion.bad;

public class MySQLDatabase implements DataBase {

    public String save(String data) {
        System.out.println("Salvando no MySQL: " + data);
        return "OK!";
    }

}

