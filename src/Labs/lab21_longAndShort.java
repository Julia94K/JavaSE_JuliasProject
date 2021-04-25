package Labs;

public class lab21_longAndShort {
// "Длинный и короткий
//    Поиск в массиве целых чисел минимума и максимума значений.
//    Нельзя использовать метод Arrays.sort и подобные ему. Нельзя сортировать массив значений."

public static void main(String[] args) {
    int [] arr =new int []{74,23,3,-99,304,13,62,-145,88,40};
    int max = 0;
    int min = 0;

    //подсчитываем максимум
    for (int i = 0; i < arr.length-1; i++) {
        arr[0]=max;
        if (max<arr[i+1]){
            max = arr[i+1];
        }
    }
    System.out.println("Максимальное значение массива = "+max);

    //подсчитываем минимум
    for (int j = 0; j < arr.length-1; j++) {
        arr[0] = min;
        if (min>arr[j+1]){
            min=arr[j+1];
        }
    }
    System.out.println("Минимальное значение массива = " +min);

}

}
