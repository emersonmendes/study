package br.com.emersonmendes.study.solid._2openclosed.good;

public class PaymentService {

    public String processPayment(Payment payment) {
        payment.processPayment(payment);
        return "OK!";
    }

}
