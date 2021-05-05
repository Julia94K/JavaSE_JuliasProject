package Labs.lab23_MatrixHasYou;


import java.util.Random;

public class Matrix {

    public int m;
    public int n;
    private int[][] matrix;


    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        Matrix matrix3 = new Matrix(3, 3);
        matrix1.createMatrix();
        System.out.println();
        matrix2.createMatrix();
        System.out.println("+++++++");
        matrix1.add(matrix2);
        matrix1.add(matrix3);
    }

    //заполнить матрицу рандомными значениями и вывести на экран

    public void createMatrix() {
        matrix = new int[m][n];
        Random r = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(20);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void add(Matrix x) {
        if (x.getM() == getM() && x.getN() == getN()) {
            for (int i = 0; i < getM(); i++) {
                for (int j = 0; j < getN(); j++) {
                    matrix[i][j] = matrix[i][j] + x.matrix[i][j];
                    System.out.print(" " + matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error!");
        }
    }


    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}


