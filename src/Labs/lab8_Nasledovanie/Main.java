package Labs.lab8_Nasledovanie;
//Наследие
//        Создать базовый абстрактный класс.
//        Создать два интерфейса, которые являются носителями свойств (по одному свойству каждый).
//        Реализовать конкретные классы вида:
//        1) наследник базового абастрактного класса и реализатор первого интерфейса.
//        2) наследник базового абастрактного класса и реализатор второго интерфейса.
//        3) наследник базового абастрактного класса и реализатор и первого и второго интерфейсов.
//        Затем создать класс Main, в котором создать экземпляры трех классов и продемонстрировать
//        их работу посредством вызова всех их методов.
public class Main {
    public static void main(String[] args) {
        MyTV AppleTV = new MyTV();
        Smartphone Iphone11 = new Smartphone();
        MyComputer MacBook = new MyComputer();
        System.out.println("I would like to use my TV");
        AppleTV.on();
        AppleTV.playVideo();
        System.out.println();
        System.out.println("I would like to use my Phone");
        Iphone11.on();
        Iphone11.playGame();
        Iphone11.playVideo();
        System.out.println();
        System.out.println("I would like to use my computer");
        MacBook.on();
        MacBook.playGame();
    }
}

