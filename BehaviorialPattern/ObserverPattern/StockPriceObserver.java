package BehaviorialPattern.ObserverPattern;

public interface StockPriceObserver {
    public void onPriceChanged(String ticker, double oldPrice, double newPrice);
}
