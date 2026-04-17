package SOLIDPrinciple.PaymentProcessorSystem;

public interface TransactionRepository {
    public void save(String method, double amount);
}
