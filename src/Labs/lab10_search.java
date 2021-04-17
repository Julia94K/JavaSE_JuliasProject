package Labs;

public class lab10_search {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 44, 15, 99, 1, 13, 88, 4, 61, 2};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}


