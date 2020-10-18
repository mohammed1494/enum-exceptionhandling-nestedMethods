package Nested;

public class PaymentSystem {

    public String payment;

    public void with(String paymentProcess) {
        System.out.println("Process payment");

        if (paymentProcess.equalsIgnoreCase("cash")) {
            PayByCash.acceptPaymentWithCash();
        } else if (paymentProcess.equalsIgnoreCase("creditcard")) {
            PayByCreditCard.acceptPaymentWithCreditCard();
        } else if (paymentProcess.equalsIgnoreCase("crypto")) {
            PayByCrypto.acceptPaymentWithCrypto();
        }
    }

private static class PayByCash {
    private static void acceptPaymentWithCash() {
        System.out.println("Please process cash payment");
    }
}
private static class PayByCreditCard {
    private static void acceptPaymentWithCreditCard() {
        System.out.println("Please process credit card payment");
    }
}

private static class PayByCrypto {
    private static void acceptPaymentWithCrypto() {
        System.out.println("Please process Bitcoin payment");
    }
}

}
