package Labs;

import java.util.Scanner;

public class lab3_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number");
        int num = in.nextInt();
        if (num / 10000 == num % 10 && num > 9999 && num < 100000) {
            System.out.println("This is a palindrome number with 5 characters");
        } else if (num < 9999) {
            System.out.println("Type in the number with 5 characters");
        } else System.out.println("This isn't a palindrome number");

    }
}

//if (num/10000 == num % 10 && (num/1000) % 10 == (num % 100)/10)
//54045
//939
//54035