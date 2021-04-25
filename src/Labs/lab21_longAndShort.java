package Labs;

public class lab21_longAndShort {
// "Длинный и короткий
//    Поиск в массиве целых чисел минимума и максимума значений.
//    Нельзя использовать метод Arrays.sort и подобные ему. Нельзя сортировать массив значений."

public static void main(String[] args) {
    int N = 1000;
    int [] arr =new int []{74,23,3,99,4,13,62,5,88,40};
    int max = 0;
    int min = N;

    for (int i = 0; i < arr.length; i++) {
        if (max<arr[i]){
            max = arr[i];
        }
    }
    System.out.println("Максимальное значение массива = "+max);

    for (int j = 0; j < arr.length; j++) {
        if (min>arr[j]){
            min=arr[j];
        }
    }
    System.out.println("Минимальное значение массива = " +min);

}

}
