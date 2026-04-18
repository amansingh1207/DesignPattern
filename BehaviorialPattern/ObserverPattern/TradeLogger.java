package BehaviorialPattern.ObserverPattern;

public class TradeLogger implements StockPriceObserver{
    public void onPriceChanged(String ticker, double oldPrice, double newPrice) {
        logPriceChange(ticker, oldPrice, newPrice, System.currentTimeMillis());
    }

    public void logPriceChange(String ticker, double oldPrice,
            double newPrice, long timestamp) {
        System.out.printf("[LOG %d] %s: ₹%.2f -> ₹%.2f%n",
            timestamp, ticker, oldPrice, newPrice);
    }
}
