package BehaviorialPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket {
    private Map<String, Double> prices = new HashMap<>();
    private List<StockPriceObserver> listeners = new ArrayList<>();

    public void updatePrice(String ticker, double newPrice){
        double oldPrice = prices.getOrDefault(ticker, 0.0);
        prices.put(ticker, newPrice);
        
        for(StockPriceObserver listener : listeners){
            listener.onPriceChanged(ticker, oldPrice, newPrice);
        }
    }

    public double getPrice(String ticker) {
        return prices.getOrDefault(ticker, 0.0);
    }
    // private double calculateChange(String ticker, double now) {
    //     double oldPrice = prices.getOrDefault(ticker, 0.0);
    //     if (oldPrice == 0.0) return 0;
    //     return ((now - oldPrice) / oldPrice) * 100;
    // }
    public void addObserver(StockPriceObserver observer) {
        listeners.add(observer);
    }
    public void removeObserver(StockPriceObserver observer) {
        listeners.remove(observer);
    }
}
