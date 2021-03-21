package Labs;

import java.util.Scanner;

//почему строчка со вторником печатается дважды как 1 и 2?
public class lab2_rememberEverything {
    public static void main(String[] args) {
        int day;
        int n = 0;
        while (n <= 100) {
            day = n ++ % 7;
            switch (day) {
                case (1):
                    System.out.println("Monday has number" + " " + day);
                case (2):
                    System.out.println("Tuesday has number" + " " + day);
                    break;
                case (3):
                    System.out.println("Wednesday has number" + " " + day);
                    break;
                case (4):
                    System.out.println("Thursday has number" + " " + day);
                    break;
                case (5):
                    System.out.println("Friday has number" + " " + day);
                    break;
                case (6):
                    System.out.println("Suturday has number" + " " + day);
                    break;
                case (7):
                    System.out.println("Sunday has number" + " " + day);
                    break;
            }

        }

        //а эта программа с консольным вводом
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number of the day");
        int num=in.nextInt();
        switch (num) {
            case (1):
                System.out.println("Monday has number" + " " + num);
            case (2):
                System.out.println("Tuesday has number" + " " + num);
                break;
            case (3):
                System.out.println("Wednesday has number" + " " + num);
                break;
            case (4):
                System.out.println("Thursday has number" + " " + num);
                break;
            case (5):
                System.out.println("Friday has number" + " " + num);
                break;
            case (6):
                System.out.println("Suturday has number" + " " + num);
                break;
            case (7):
                System.out.println("Sunday has number" + " " + num);
                break;
            default:
                System.out.println("ERROR!");
        }
    }
}
