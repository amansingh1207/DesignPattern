package BirdProblem;

public class Bird {
    String name;
    FlyBehavior flyingBehavior;

    Bird(String name, FlyBehavior flyingBehavior){
        this.name = name;
        this.flyingBehavior = flyingBehavior;
    }

    public void eat(){
        System.out.println(name+ "is eating");
    }

    public void performFly(){
        flyingBehavior.fly();
    }
}
