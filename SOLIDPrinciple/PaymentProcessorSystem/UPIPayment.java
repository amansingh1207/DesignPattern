package SOLIDPrinciple.PaymentProcessorSystem;

public class UPIPayment implements Payment{
    public void process(double amount){
        System.out.println("Processing UPI: Rs " + amount);
    }

    public String getName(){
        return "UPI";
    }
}
