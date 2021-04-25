package Labs;

import java.util.Scanner;


//Напишите программу, которая должна определить, пройдет ли кирпич в отверстие.
//Размеры отверстия (длина и высота) вводит пользователь.
//Тоже самое касается габаритов кирпича, пользователь вводит в программу значения длины, ширины и высоты кирпича.
//Умный строитель умеет вращать кирпич и может пытаться пропихнуть кирпич в отверстие разными сторонами.
public class lab11_Builder {
    public static void main(String[] args) {
        System.out.println("Введите параметры отверстия!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Сначала введите длину отверстия: ");
        int length = sc.nextInt(); //длина отверстия
        System.out.println("Теперь введите высоту отверстия: ");
        int height = sc.nextInt();//высота отверстия
        System.out.println("Введите габариты кирпича!");
        System.out.println("Введите длину кирпича: ");//длина кирпича
        int length2 = sc.nextInt();
        System.out.println("Теперь введите ширину кирпича: ");//ширина кирпича
        int width2 = sc.nextInt();
        System.out.println("Теперь введите высоту кирпича: ");//высота кирпича
        int height2 = sc.nextInt();

        //пробуем проипихнуть 1й стороной
        if (length2 <= length && height2 <= height || length2 <= height && height2 <= length) {
            System.out.println("Кирпич прошел");
            //робуем пропихнуть 2й стороной
        } else if (height2 <= length && width2 <= height || height2 <= height && width2 <= length) {
            System.out.println("Кирпич прошел");
            // пробуем пропихнуть 3й стороной
        } else if (length2 <= length && width2 <= height || length2 <= height && width2 <= length) {
            System.out.println("Кирпич прошел");
            //тогда кипрпич не прошел
        } else System.out.println("Кирпич не пройдет");

    }
}
