package Labs.lab8_Nasledovanie;

public class Smartphone extends Device implements Playable, Watchable {
    @Override
    public void on() {
        System.out.println("Your smartphone is on!");
    }

    @Override
    public void playVideo() {
        System.out.println("Video started on your smartphone!");
    }

    @Override
    public void playGame() {
        System.out.println("Smartphone Game mode on now!");
    }
}
