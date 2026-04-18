package BehaviorialPattern.ObserverPattern;

public class DashboardDisplay implements StockPriceObserver{
    public void onPriceChanged(String ticker, double oldPrice, double newPrice) {
        double percentChange = ((newPrice - oldPrice) / oldPrice);
                refreshTicker(ticker, newPrice, percentChange);
    }
    
    public void refreshTicker(String ticker, double price, double percentChange) {
        System.out.printf("[DASHBOARD] %s: ₹%.2f (%+.1f%%)%n",
            ticker, price, percentChange);
    }
}