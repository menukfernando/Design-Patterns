package com.example.designpattern.question.three;

public class PaymentAdapterMain {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentAdapter();

        processor.processPayment(99.99);
        processor.verifyPayment("12345");
    }
}