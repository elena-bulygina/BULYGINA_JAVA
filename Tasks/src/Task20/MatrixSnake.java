package Task20;

// Создать квадратную матрицу, заполнить ее следующим видом:
// 1   2  3 4
// 12 13 14 5
// 11 16 15 6
// 10  9  8 7

import java.util.Scanner;

public class MatrixSnake {
    public void print(int n,int[][] matr) {
        String element;
        int lenelem = 0;
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                element = String.valueOf(matr[i][j]);
                lenelem = element.length();
                maxlen = String.valueOf(n*n).length();
                for (int k = 0; k < maxlen-lenelem; k++)
                    element = element + " ";
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public int fillSnakeRing(int cntelem,int n,int[][] matrix,int ringNumber) {
        int i = ringNumber - 1;
        int j = ringNumber - 1;
        for (int k = j; k < n - ringNumber + 1; k++) {
            matrix[i][k] = cntelem;
            cntelem++;
        }
        j = n - ringNumber;
        for (int k = i + 1; k < n - ringNumber + 1; k++) {
            matrix[k][j] = cntelem;
            cntelem++;
        }
        i = n - ringNumber;
        for (int k = j - 1; k >= 0 + ringNumber - 1; k--) {
            matrix[i][k] = cntelem;
            cntelem++;
        }
        j = ringNumber - 1;
        for (int k = i - 1; k > 0 + ringNumber - 1; k--) {
            matrix[k][j] = cntelem;
            cntelem++;
        }
        return cntelem;
    }

    public int[][] fillMatrixWithSnake(int n) {
        int[][] matrix = new int[n][n];
        int numberOfRings = n/2;
        int currentValue = 1;
        for (int i = 0; i < numberOfRings; i++)
            currentValue = fillSnakeRing(currentValue,n,matrix,i+1);
        if (n%2 == 1) matrix[n/2][n/2] = n*n;
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы :");
        int n = scanner.nextInt();
        MatrixSnake matrixsn = new MatrixSnake();
        int[][] matrix = matrixsn.fillMatrixWithSnake(n);
        System.out.println();
        System.out.println("Матрица :");
        matrixsn.print(n,matrix);
    }
}


