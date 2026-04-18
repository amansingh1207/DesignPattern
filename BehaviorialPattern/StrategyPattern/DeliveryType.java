package BehaviorialPattern.StrategyPattern;

public interface DeliveryType {
    public double calculateCharge(double distanceKm, boolean isPeakHour, int scheduledHour);
    public String getDeliveryType();
}
