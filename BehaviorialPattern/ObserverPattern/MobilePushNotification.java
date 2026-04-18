package BehaviorialPattern.ObserverPattern;

public class MobilePushNotification implements StockPriceObserver{
    public void onPriceChanged(String ticker, double oldPrice, double newPrice) {
        sendMobilePush(ticker, oldPrice, newPrice); 
    }

    public void sendMobilePush(String ticker, double oldPrice,
            double newPrice) {
        System.out.printf("[MOBILE PUSH] %s: ₹%.2f -> ₹%.2f%n",
            ticker, oldPrice, newPrice);
    }
}
