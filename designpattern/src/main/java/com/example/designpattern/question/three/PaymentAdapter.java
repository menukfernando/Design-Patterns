package com.example.designpattern.question.three;

interface PaymentProcessor {
    void processPayment(double amount);
    boolean verifyPayment(String paymentId);
}

class ThirdPartyPaymentLibrary {
    public void makePayment(float amount, String currency) {
        System.out.println("Third party processing: " + amount + " " + currency);
    }
    
    public int validatePayment(int transactionId) {
        System.out.println("Third party validating transaction: " + transactionId);
        return 1;
    }
}

class PaymentAdapter implements PaymentProcessor {
    private final ThirdPartyPaymentLibrary paymentLib;
    
    public PaymentAdapter() {
        this.paymentLib = new ThirdPartyPaymentLibrary();
    }
    
    @Override
    public void processPayment(double amount) {
        paymentLib.makePayment((float)amount, "USD");
    }
    
    @Override
    public boolean verifyPayment(String paymentId) {
        int transactionId = Integer.parseInt(paymentId);
        return paymentLib.validatePayment(transactionId) == 1;
    }
}
