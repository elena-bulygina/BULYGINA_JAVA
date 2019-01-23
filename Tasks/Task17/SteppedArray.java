package Task17;

// Создать ступенчатый массив, где каждая строка будет иметь свой размер (случайный)
// и каждая строка будет выведена на экран, заполенная случайными числами.

import java.util.Random;

public class SteppedArray {
    public static void main(String[] args) {
        int n = 10;
        int array[][] = new int[n][];
        Random random = new Random();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = random.nextInt(10) + 1;
            array[i] = new int[m[i]];
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("array[" + i + "] : ");
            for (int j = 0; j < m[i]; j++) {
                array[i][j] = random.nextInt(15);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
