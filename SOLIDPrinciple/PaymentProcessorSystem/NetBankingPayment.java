package SOLIDPrinciple.PaymentProcessorSystem;

public class NetBankingPayment implements Payment{
    public void process(double amount){
        System.out.println("Net banking transfer: Rs " + amount);
    }

    public String getName(){
        return "NetBanking";
    }
}
