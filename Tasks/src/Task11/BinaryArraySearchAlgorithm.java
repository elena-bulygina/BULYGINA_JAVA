package Task11;

import java.util.Scanner;

//  В отсортированном массиве, считанным с клавиатуры реализовать алгоритм бинарного поиска.
//  Пусть есть отсортирoванный массив
//  10 15 45 58 59 63 89 90 95 101 115 135 140
//  Допустим, мы хотим найти число 101.
//  left = 0  right = 13  middle = left + (rigt - left) / 2 = 0 + (13 - 0) / 2 = 7
//  10 15 45 58 59 63 89 90 95 101 115 135 140
//  |                     |                 |
//  L                     M                 R
//  Смотрим на middle, этот элемент больше или меньше искомого?
//  Поэтому:  left = middle = 7  right = right = 13
//            middle = left + (rigt - left) / 2 = 7 + (13 -7) / 2 = 10
//  10 15 45 58 59 63 89 90 95 101 115 135 140
//                        |         |       |
//                        L         M       R
//  Смотрим на middle, этот элемент больше или меньше? - больше
//  left = middle = 7  right = middle = 10
//  middle = left + (rigt - left) / 2 = 7 + (10 -7) / 2 = 8
//  10 15 45 58 59 63 89 90 95 101 115 135 140
//                        |  |      |
//                        L  M      R

import java.util.Scanner;

class BinaryArraySearchAlgorithm {
    public static void main(String[] args) {
        int middle = -1, left = -1, right = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите искомое число :");
        int number = scanner.nextInt();

        System.out.println("Введите размер массива :");
        int n = scanner.nextInt();

        int array[] = new int[n];
        System.out.println("Введите элементы отсортированного массива :");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        left = 0;
        right = n-1;
        middle = left + (right - left) / 2;

        while ((array[middle] != number)&&(middle != right)&&(middle != left)) {
            if (array[middle] < number) {
               left = middle;
               middle = left + (right - left) / 2;
            }
            else
                if (array[middle] > number) {
                    right = middle;
                    middle = left + (right - left) / 2;
                }
        }

        if (array[middle] == number) {
            System.out.println("Число " + number + " является элементом массива с индексом " + middle + ".");
        }
        else
            if (array[left] == number) {
                System.out.println("Число " + number + " является элементом массива с индексом " + left + ".");
            }
            else
                if (array[right] == number) {
                    System.out.println("Число " + number + " является элементом массива с индексом " + right + ".");
                }
                else
                    System.out.println("Число "+number+" не является элементом массива.");
    }
}
