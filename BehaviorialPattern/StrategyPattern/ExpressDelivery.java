package BehaviorialPattern.StrategyPattern;

public class ExpressDelivery implements DeliveryType{
    public double calculateCharge(double distanceKm, boolean isPeakHour, int scheduledHour){
        double baseFee = 20.0;
        double fee;
        double expressPremium = 50.0;
        double surgeMultiplier = isPeakHour ? 2.5 : 1.8;
        fee = baseFee + expressPremium
        + (distanceKm * 12.0 * surgeMultiplier);
        // Cap at 500 rupees
        fee = Math.min(fee, 500.0);
        return fee;
    }

    public String getDeliveryType(){
        return "Express";
    }
}
