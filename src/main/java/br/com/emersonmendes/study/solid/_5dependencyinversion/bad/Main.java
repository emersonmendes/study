package br.com.emersonmendes.study.solid._5dependencyinversion.bad;

public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService( (operation) ->  {
            if(operation.equals("read")){
                return new PostgreSQLDatabase();
            } else {
                return new MySQLDatabase();
            }
        });
        orderService.saveOrder("ssss");


    }

}
