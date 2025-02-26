package br.com.emersonmendes.study.solid._5dependencyinversion.bad;

public class PostgreSQLDatabase implements DataBase {

    @Override
    public String save(String order) {
        return "";
    }

}
