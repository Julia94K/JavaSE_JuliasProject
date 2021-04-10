package Labs;

import java.util.Scanner;

public class lab12_codeOfdaVinci {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел фибоначи: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int l = 1;
        int r = 1;
        System.out.println(l);
        int nextNumber;
        int count =0;
        while (count < N-1){
            nextNumber = l + r;
            l = r;
            r = nextNumber;
            System.out.println(nextNumber);
            count++;
        }
//        while (nextNumber <= N) {
//            nextNumber = l + r;
//            l = r;
//            r = nextNumber;
//            System.out.println(nextNumber);
//        }
    }
}
