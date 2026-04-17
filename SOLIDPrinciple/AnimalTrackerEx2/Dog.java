package SOLIDPrinciple.AnimalTrackerEx2;

public class Dog implements Walkable, Swimmable{
    public void walk(){
        System.out.println("Dog is walking");
    }
    public void swim(){
        System.out.println("Dog is swimming");
    }
}
