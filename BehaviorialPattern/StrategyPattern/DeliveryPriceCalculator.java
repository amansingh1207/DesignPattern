package BehaviorialPattern.StrategyPattern;

public class DeliveryPriceCalculator {
    private  DeliveryType deliveryType;

    public DeliveryPriceCalculator(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public double calculateDeliveryFee(double distanceKm, boolean isPeakHour, int scheduledHour){
        double fee = deliveryType.calculateCharge(distanceKm, isPeakHour, scheduledHour);
        // Apply tax (all types)
        fee *= 1.18; // 18% GST
        return Math.round(fee * 100.0) / 100.0;

    }

    public void setDeliveryType(DeliveryType newDeliveryType){
        this.deliveryType = newDeliveryType;
    }

    public void printReceipt(double distance, boolean isPeakHour, int scheduledHour) {
        double price = calculateDeliveryFee(distance, isPeakHour, scheduledHour);
        System.out.printf(
            "[%s] %.1f km | Peak: %s | Fee: Rs. %.2f%n",
            deliveryType.getDeliveryType(), distance,
            isPeakHour ? "Yes" : "No", price);

    }

    
}
