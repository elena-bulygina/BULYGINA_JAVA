package Task19;
// Создать матрицу, считать ее с консоли. Вывести матрицу, у которой элементы
// выше главной диагонали будут увеличены вдвое, ниже главной диагонали будут уменьшены вдвое.

import java.util.Scanner;

public class MatrixTransformation {
    public void print(int n,int[][] matr) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print(matr[i][j] + " ");
            System.out.println();
        }
    }

    public void matrixTransform(int n,int[][] matr) {
        for (int i = 0; i < n; i++)
            for (int j = i + 1 ; j < n; j++)
                matr[i][j] = matr[i][j] * 2;
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                matr[i][j] = matr[i][j] / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы :");
        int n = scanner.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Введите элементы матрицы :");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                 matrix[i][j] = scanner.nextInt();
            }
        MatrixTransformation matrixtrans = new MatrixTransformation();
        System.out.println();
        System.out.println("Исходная матрица :");
        matrixtrans.print(n,matrix);
        matrixtrans.matrixTransform(n,matrix);
        System.out.println();
        System.out.println("Преобразованная матрица :");
        matrixtrans.print(n,matrix);
    }
}