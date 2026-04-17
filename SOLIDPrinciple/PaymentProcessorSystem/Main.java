package SOLIDPrinciple.PaymentProcessorSystem;

public class Main {
    public static void main(String[] args) {
        Payment paymethod = new CreditCardPayment();
        TransactionRepository repo = new DatabaseTransactionRepository();
        PaymentProcessor p = new PaymentProcessor(paymethod, repo);
        p.processPayment(500);

    }
}
