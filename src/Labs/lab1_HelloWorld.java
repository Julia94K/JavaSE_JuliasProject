package Labs;

public class lab1_HelloWorld {
    public static void main(String[] args) {
        //ЦИКЛ WHILE
        System.out.println("Here is while!");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("Hello Word"+ " "  + i);
        }

        //цикл for
        System.out.println("Here is for!");
        for (int n = 0;n<100; n++){
            System.out.println("Hey you"+" " +  n);
        }

        //цикл do...while
        System.out.println("Here is do while!");
        int l = 15;
        do{
            System.out.println("Hello lovely world"+" "+l);
            l--;
        }
        while (l>0);

    }
}
