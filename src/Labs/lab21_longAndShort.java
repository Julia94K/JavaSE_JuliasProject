package Labs;

public class lab21_longAndShort {
// "Длинный и короткий
//    Поиск в массиве целых чисел минимума и максимума значений.
//    Нельзя использовать метод Arrays.sort и подобные ему. Нельзя сортировать массив значений."

public static void main(String[] args) {
    int [] arr =new int []{157,23,3,-99,304,13,62,145,88,940};


    //подсчитываем максимум
    int max=arr[0];
    for (int i = 0; i < arr.length-1; i++) {
        if (max<arr[i+1]){
            max = arr[i+1];
        }
    }
    System.out.println("Максимальное значение массива = "+max);

    //подсчитываем минимум
    int min = arr[0];
    for (int j = 0; j < arr.length-1; j++) {

        if (min>arr[j+1]){
            min=arr[j+1];
        }
    }
    System.out.println("Минимальное значение массива = " +min);

}

}
