package br.com.emersonmendes.study.solid._2openclosed.good;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment(new Visa());
        paymentService.processPayment(new MasterCard());


    }
}
