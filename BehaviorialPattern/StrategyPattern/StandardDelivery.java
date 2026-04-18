package BehaviorialPattern.StrategyPattern;

public class StandardDelivery implements DeliveryType{
    public double calculateCharge(double distanceKm, boolean isPeakHour, int scheduledHour){
        // Standard: base + per-km charge
    // Peak hours get 1.5x multiplier
        double baseFee = 20.0;
        double fee;
        double perKmRate = 8.0;
        fee = baseFee + (distanceKm * perKmRate);
        if (isPeakHour) {
        fee *= 1.5;
        }
        // Free delivery for orders &gt; 10km (loyalty perk)
        if (distanceKm > 10) {
        fee = Math.max(fee - 30, baseFee);
        }
        return fee;
    }

    public String getDeliveryType(){
        return "Standard";
    }
}
