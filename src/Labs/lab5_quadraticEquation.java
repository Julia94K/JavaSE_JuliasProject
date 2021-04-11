package Labs;
//"Квадратное уравнение
//По введенным трем коэффициэнтам, вывести решение квадратного уравнения вида ax^2 + bx + c = 0
//Использовать класс Scanner для ввода значений с клавиатуры."

import java.util.Scanner;
//например, a = 1; b = −6; c = 9 ->  1 решение
//a = 1, b = −8, c = 12; -> 2 решения
//a = 5; b = 3; c = 7; - > нет решения
public class lab5_quadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        System.out.println("Введите число c");
        int c = in.nextInt();
        int x;
        int D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("Решение отсутствует");
        } else if (D == 0) {
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1;
            x1 = (-b + Math.sqrt(D)) /(2 * a);
            double x2;
            x2 = (-b - Math.sqrt(D)) /(2 * a);
            System.out.println("x1 = " + ((int) x1));
            System.out.println("x2 = " + ((int)x2));
        }
    }
}


