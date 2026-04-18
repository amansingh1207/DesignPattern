package BehaviorialPattern.StrategyPattern;

public class ScheduledDeliveryType implements DeliveryType{
    public double calculateCharge(double distanceKm, boolean isPeakHour, int scheduledHour){
        // Scheduled: discount for off-peak, premium for
        // prime slots (12-1pm, 7-9pm)
        double baseFee = 20.0;
        double fee;
        double perKmRate = 6.0;
        fee = baseFee + (distanceKm * perKmRate);
        if (scheduledHour >= 12 && scheduledHour <= 13) {
        fee *= 1.3; // Lunch premium
        } else if (scheduledHour >= 19 && scheduledHour <= 21) {
        fee *= 1.4; // Dinner premium
        } else if (scheduledHour >= 22 || scheduledHour <= 6) {
        fee *= 0.7; // Late night discount
        }
        return fee;
    }

    public String getDeliveryType(){
        return "Scheduled";
    }
}
