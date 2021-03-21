package Labs;

import java.util.Scanner;

public class lab3_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number");
        int num=in.nextInt();
        if (num >=9999 && num/10000 == num % 10 && (num/1000) % 10 == (num % 100)/10){
        System.out.println("This is a palindrome number");}
        else System.out.println("This isn't a palindrome number with 5 characters");
    }
}

//54045