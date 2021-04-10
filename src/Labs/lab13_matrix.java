package Labs;
//"След матрицы
//Найти след матрицы,  след матрицы — сумма элементов главной диагонали.
// Размер матрицы вводит пользователь, матрицу заполнять случайными числами.
//----------------
//Пример работы программы:
//Введите количество строк матрицы: 5
//
//61  16  39  79  99
//66  42  71   5  68
//80  64  34  12  44
//63  64  40  21   3
//17  31  99  41  72

import java.util.Random;
import java.util.Scanner;

public class lab13_matrix {
    public static void main(String[] args) {
        System.out.println("Введите количество строк матрицы: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] arr = new int[num][num];
        for ( int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Random ra = new Random();
                arr[i][j] = ra.nextInt(50);
                System.out.println("" +
                        "" + arr[i][j] + "");
            }
            System.out.println();
        }
        int sumDiagonal = 0;
        for (int x = 0, y = 0, z = arr.length; x < z && y < z; x++, y++) {
            sumDiagonal += arr[x][y];
        }
        System.out.println("След матрицы: "+ sumDiagonal);
    }
}




