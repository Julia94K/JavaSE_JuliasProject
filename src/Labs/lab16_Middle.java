package Labs;

import java.util.Random;

public class lab16_Middle {
    public static void main(String[] args) {
        float[] arr = new float[5];
        for (int j = 0; j < arr.length; j++) {
            Random ra = new Random();
            arr[j] = ra.nextFloat();
            System.out.print(" " +
                    " " + arr[j] + " ");
        }
        double sum = 0;
        for (float x:arr){
            sum+=x/5;

        }
        System.out.println("Среднее арифметическое равно:"+sum);
    }
}
