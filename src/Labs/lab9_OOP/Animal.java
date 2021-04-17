package Labs.lab9_OOP;

//Овладение ООП. «Полиморфизм».
//        Придумать и реализовать иерархию из трех классов. Каждый следующий - наследник предыдущего.
//        Создайте еще один класс, который наследует один из этих трех классов (не базовый)
//        К примеру: млекопитающие -> кошки ->гладкошерстные->и т.д.
//        И кошки->вислоухие.
//        Пусть у всех таких классов будет одно общее свойство (кошки мяукают), но каждый подкласс делает это по-своему.
//        После этого создать массив млекопитающих и попросить в цикле каждого из них выполнить общее для всех действие.

public class Animal {
    int age;
    String name;
    int weight;
    int height;


    public Animal(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public static void main(String[] args) {
        System.out.println("Does every bird fly?");
        Animal[] animals = new Animal[2];
        animals[0] = new Ostrich("Ostry", 2, 156, 270);
        animals[1] = new Penguin("Pingui", 7, 40, 120);
        for (Animal a : animals) {
            a.move();
        }
    }

    public void move() {
        System.out.println("Moving like an animal");

    }
}

