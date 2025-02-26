package br.com.emersonmendes.study.solid._5dependencyinversion.bad;

public class OrderService {

    private final MyFunction provider;

    public OrderService(MyFunction provider) {
        this.provider = provider;
    }

    public String saveOrder(String order) {
        return this.provider.doSomething("read").save(order);
    }

}