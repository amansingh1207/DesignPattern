package SOLIDPrinciple.PaymentProcessorSystem;

public interface Payment {
    public void process(double amount);
    public String getName();
}
