package BehaviorialPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addObserver(new AlertSystem());
        market.addObserver(new DashboardDisplay());
        market.addObserver(new TradeLogger());
        market.addObserver(new MobilePushNotification());
        market.updatePrice("AAPL", 150.00);
        market.updatePrice("GOOG", 2800.00);
        market.updatePrice("AAPL", 155.00); 
    }
}
