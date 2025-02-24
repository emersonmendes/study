package br.com.emersonmendes.study.solid._5dependencyinversion.bad;

public class OrderService {

    private MySQLDatabase database;

    public OrderService() {
        this.database = new MySQLDatabase();
    }

    public String saveOrder(String order) {
        return database.save(order);
    }

}