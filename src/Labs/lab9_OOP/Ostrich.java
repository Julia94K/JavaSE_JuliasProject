package Labs.lab9_OOP;

public class Ostrich extends Flightless {
    public Ostrich(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }
    @Override
    public void move(){
        System.out.println("Ostrich: I cannot fly, but I can run");
    }
}
