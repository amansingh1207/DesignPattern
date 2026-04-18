package BehaviorialPattern.StrategyPattern;

public class Subscription implements DeliveryType {
    @Override
    public double calculateCharge(double distanceKm, boolean isPeakHour, int scheduledHour) {
        double baseFee = 20.0;
        double fee;
        fee = 25.0 + baseFee; // Flat fee for subscription
        return fee;
    }

    @Override
    public String getDeliveryType() {
        return "Subscription";
    }
    
}
