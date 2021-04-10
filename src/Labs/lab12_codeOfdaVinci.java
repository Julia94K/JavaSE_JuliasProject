package Labs;

import java.util.Scanner;

public class lab12_codeOfdaVinci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int l = 1;
        int r = 1;
        System.out.println(l);
        int nextNumber = 0;
        while (nextNumber <= N) {
            nextNumber = l + r;
            l = r;
            r = nextNumber;
            System.out.println(nextNumber);
        }
    }
}
