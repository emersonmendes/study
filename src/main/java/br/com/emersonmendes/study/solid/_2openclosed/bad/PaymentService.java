package br.com.emersonmendes.study.solid._2openclosed.bad;

public class PaymentService {

    public String processPayment(String cardType, double amount) {

        if (cardType.equalsIgnoreCase("VISA")) {
            return "Paid with Visa, the amount of $" + amount + ".";
        } else if(cardType.equalsIgnoreCase("MASTERCARD")) {
            return "Paid with MasterCard, the amount of $" + amount + ".";
        }

        return null;

    }

}
