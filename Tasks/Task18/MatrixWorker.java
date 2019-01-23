package Task18;

//  Создать две матрицы размеров N * N, реализовать класс MatrixWorker, в котором будут методы
//	public int[][] sum(int a[][], int b[][]) {} и public int[][] mult(int a[][], int b[][]) {}

import java.util.Random;

public class MatrixWorker {
    public int[][] sum(int a[][], int b[][]) {
        int n = a[0].length;
        int[][] matrixsum = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrixsum[i][j] = a[i][j] + b[i][j];
        return matrixsum;
    }

    public int[][] mult(int a[][], int b[][]) {
        int n = a[0].length;
        int[][] matrixmult = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrixmult[i][j] = a[i][j] * b[i][j];
        return matrixmult;
    }

    public void init(int a[][]) {
        Random random = new Random();
        int n = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = random.nextInt(10);
        }
    }

    public void print(int a[][]) {
        int n = a[0].length;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int matrix1[][] = new int[n][n];
        int matrix2[][] = new int[n][n];

        MatrixWorker matrixwork = new MatrixWorker();
        matrixwork.init(matrix1);
        System.out.println("Матрица 1 :");
        matrixwork.print(matrix1);
        System.out.println();
        matrixwork.init(matrix2);
        System.out.println("Матрица 2 :");
        matrixwork.print(matrix2);
        System.out.println();
        System.out.println("Сумма двух матриц :");
        matrixwork.print(matrixwork.sum(matrix1,matrix2));
        System.out.println();
        System.out.println("Произведение двух матриц :");
        matrixwork.print(matrixwork.mult(matrix1,matrix2));
    }
}
