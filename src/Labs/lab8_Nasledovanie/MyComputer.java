package Labs.lab8_Nasledovanie;

public class MyComputer extends Device implements Playable {
    @Override
    public void on() {
        System.out.println("Your computer is on now!");
    }
    @Override
    public void playGame() {
        System.out.println("Computer Game mode on!");
    }

}
