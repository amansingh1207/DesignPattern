package BehaviorialPattern.ObserverPattern;

public class AlertSystem implements StockPriceObserver{
    public void onPriceChanged(String ticker, double oldPrice, double newPrice) {
        double percentChange = ((newPrice - oldPrice) / oldPrice);
        if (Math.abs(percentChange) > 0.05) {
            sendThresholdAlert(ticker, oldPrice, newPrice);
        }

    }
    public void sendThresholdAlert(String ticker,
            double oldPrice, double newPrice) {
        System.out.printf(
            "[ALERT] %s moved from ₹%.2f to ₹%.2f (>5%% change)%n",
            ticker, oldPrice, newPrice);
    }
}
