package Labs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fctr = 0;
        try {
            fctr = in.nextInt();

        } catch (Exception e){
            System.out.println("Error");
            return;
        }
        System.out.println(getFctr(fctr));
    }

    public static int getFctr(int f){
        int res = 1;
        for (int i = 1; i <= f ; i++) {
            res = res *i;
        }
        return res;
    }




}
