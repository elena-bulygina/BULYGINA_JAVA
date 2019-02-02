package Task20;

import java.util.Scanner;

public class Main {
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
