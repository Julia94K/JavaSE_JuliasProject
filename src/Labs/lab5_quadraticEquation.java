package Labs;
//"Квадратное уравнение
//По введенным трем коэффициэнтам, вывести решение квадратного уравнения вида ax^2 + bx + c = 0
//Использовать класс Scanner для ввода значений с клавиатуры."

import java.util.Scanner;

public class lab5_quadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        System.out.println("Введите число c");
        int c = in.nextInt();
        int num;
        num = (a*x*x)+(b*x)+c;
        System.out.println("ax^2 + bx + c = "+ num);
    }
}


