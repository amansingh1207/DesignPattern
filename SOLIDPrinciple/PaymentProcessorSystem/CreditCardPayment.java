package SOLIDPrinciple.PaymentProcessorSystem;

public class CreditCardPayment implements Payment{
    public void process(double amount){
        System.out.println("Charging credit card: Rs " + amount);
    }

    public String getName(){
        return "CreditCard";
    }
}