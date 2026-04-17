package BirdProblem;

public class Main {
    public static void main(String[] args){
        Bird sparrow = new Sparrow();
        sparrow.eat();        // Sparrow is eating seeds
        sparrow.performFly(); // Flying high!

        Bird penguin = new Penguin();
        penguin.eat();        // Penguin is eating seeds
        penguin.performFly();
    }
}
