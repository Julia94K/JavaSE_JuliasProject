package Labs;
//Драконий мир
//        Создать класс Dragon, добавить в него два свойства (поля) name и tooth.
//        Создать два метода getter-а getName() getTooth()
//        Добавить метод для удара огнем fire(). Этот метод принимает в качестве
//        значения другого дракона Dragon и описывает в виде строки в консоли, что один дракон ударил другого.

public class Dragon {
    private final String name;
    private final int tooth;

    public Dragon (String name, int tooth) {
        this.name = name;
        this.tooth = tooth;
    }

    static Dragon d1 = new Dragon("Беззубик",0);
    static Dragon d2 = new Dragon("Малыш",100);

    public static void main(String[] args) {
        d1.fire("Малыш");
        d2.fire("Беззубик");
    }

    private String getName() {
        return name;
    }
    public void fire(String name){
        System.out.println("Дракон "+getName()+" ударил огнем дракона "+name);
    }




    public int getTooth() {
        return tooth;
    }
}


