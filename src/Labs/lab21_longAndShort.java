package Labs;

public class lab21_longAndShort {
// "Длинный и короткий
//    Поиск в массиве целых чисел минимума и максимума значений.
//    Нельзя использовать метод Arrays.sort и подобные ему. Нельзя сортировать массив значений."

public static void main(String[] args) {
    int [] arr =new int []{157,923,3,-99,-304,13,62,145,88,40};


    //подсчитываем максимум
    int max=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (max<arr[i]){
            max = arr[i];
        }
    }
    System.out.println("Максимальное значение массива = "+max);

    //подсчитываем минимум
    int min = arr[0];
    for (int j = 0; j < arr.length; j++) {

        if (min>arr[j]){
            min=arr[j];
        }
    }
    System.out.println("Минимальное значение массива = " +min);

}

}
