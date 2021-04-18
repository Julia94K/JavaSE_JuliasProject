package Labs.lab8_Nasledovanie;

public class MyTV extends Device implements Watchable {
    @Override
    public void on() {
        System.out.println("Your TV is on now!");
    }

    @Override
    public void playVideo() {
        System.out.println("Video started on your TV!");
    }
}
