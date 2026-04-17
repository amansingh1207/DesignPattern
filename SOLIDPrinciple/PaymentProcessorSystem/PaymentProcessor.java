package SOLIDPrinciple.PaymentProcessorSystem;

public class PaymentProcessor {
    private final Payment paymentMethod;
    private final TransactionRepository repo;

    public PaymentProcessor(Payment paymentMethod, TransactionRepository repo) {
        this.paymentMethod = paymentMethod;
        this.repo = repo;
    }

    public void processPayment(double amount){
        paymentMethod.process(amount);
        repo.save(paymentMethod.getName(), amount);
    }



    
}
