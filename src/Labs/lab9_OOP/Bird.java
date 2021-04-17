package Labs.lab9_OOP;

public class Bird extends Animal{


    public Bird(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void move(){
        System.out.println("I can move");
    }
}
