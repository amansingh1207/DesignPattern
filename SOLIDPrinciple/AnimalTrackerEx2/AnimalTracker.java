package SOLIDPrinciple.AnimalTrackerEx2;

class AnimalTracker {
    private final AnimalRepo repository;

    public AnimalTracker(AnimalRepo repository) {
        this.repository = repository;  // injected, not hardcoded
    }

    // Takes Walkable — any animal that can walk, not just Dog
    public void trackWalk(Walkable animal) {
        animal.walk();
        repository.save(animal.toString());
    }

    // Takes Swimmable — any animal that can swim
    public void trackSwim(Swimmable animal) {
        animal.swim();
        repository.save(animal.toString());
    }

    // Takes Flyable — only animals that can actually fly
    public void trackFlight(Flyable animal) {
        animal.fly();
        repository.save(animal.toString());
    }
}
