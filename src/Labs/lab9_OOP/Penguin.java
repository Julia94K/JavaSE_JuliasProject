package Labs.lab9_OOP;

public class Penguin extends Flightless{
    public Penguin(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }
    @Override
    public void move(){
        System.out.println("Penguin: I am swimming, not flying");
    }

}
