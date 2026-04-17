package BirdProblem;

public class Penguin extends Bird{
    Penguin(){
        super("penguin", new NotFlyable());
    }
    public void swim(){
        System.out.println("Penguin is swimming!");
    }
}
