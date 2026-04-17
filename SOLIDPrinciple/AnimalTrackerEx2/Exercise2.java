package SOLIDPrinciple.AnimalTrackerEx2;


public class Exercise2 {
    public static void main(String[] args) {
        AnimalTracker tracker = new AnimalTracker(new MySQLDatabase());

        Dog dog = new Dog();
        // Eagle eagle = new Eagle();
        // Duck duck = new Duck();
        // Fish fish = new Fish();

        // Track walks — Dog, Eagle, Duck can walk
        tracker.trackWalk(dog);
        // tracker.trackWalk(eagle);
        // tracker.trackWalk(duck);
        // tracker.trackWalk(fish);  // ✗ Won't compile — Fish isn't Walkable

        // Track flights — only Eagle and Duck
        // tracker.trackFlight(eagle);
        // tracker.trackFlight(duck);
        // tracker.trackFlight(dog);  // ✗ Won't compile — Dog isn't Flyable

        // Track swimming — Dog, Duck, Fish
        // tracker.trackSwim(dog);
        // tracker.trackSwim(duck);
        // tracker.trackSwim(fish);
        // tracker.trackSwim(eagle);  // ✗ Won't compile — Eagle isn't Swimmable
    }
}