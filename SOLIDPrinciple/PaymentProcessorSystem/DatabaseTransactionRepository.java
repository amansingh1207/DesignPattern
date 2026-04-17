package SOLIDPrinciple.PaymentProcessorSystem;

public class DatabaseTransactionRepository implements TransactionRepository{
    public void save(String method, double amount){
        System.out.println("Saved transaction of " + amount + "by" + method);
    }
}
