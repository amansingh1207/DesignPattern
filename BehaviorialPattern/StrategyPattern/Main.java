package BehaviorialPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        DeliveryType deliveryType = new ExpressDelivery();
        DeliveryPriceCalculator calculator = new DeliveryPriceCalculator(deliveryType);
        calculator.printReceipt(39, true, 1);

        // Change strategy at runtime
        calculator.setDeliveryType(new StandardDelivery());
        calculator.printReceipt(39, true, 1);
        
        // Change strategy at runtime
        calculator.setDeliveryType(new Subscription());
        calculator.printReceipt(39, true, 1);

    }

}
