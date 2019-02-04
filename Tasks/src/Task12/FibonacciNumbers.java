package Task12;

//  Оптимизировать алгоритм вычисления чисел Фибоначчи, так, чтобы не было повторных
//  рекурсивных вызовов (при этом рекурсию сохранить).
//  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, ...

import java.util.Scanner;

class FibonacciNumbers {
    public static int cnt = 0;
    public static int cnt2 = 0;

    public static int fib0(int n) {
        cnt++;
        if (n == 0 || n == 1) {
            return n;
        }
        int result = fib0(n - 1) + fib0(n - 2);
        return result;
    }

    public static int fib(int n,int[] f) {
        int result = 0;
        cnt2++;
        if (n == 0 || n == 1) {
            result = n;
        }
        else {
            result = fib(n - 1,f) + f[n - 2];
        }
        f[n] = result;
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение n :");
        int n = scanner.nextInt();
        int[] func = new int[n+1];

        System.out.println("Значение функции fib("+n+")="+fib0(n));
        System.out.println("Количество вызовов функции fib(n) = fib(n-1) + fib(n-2) : " + cnt);
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println();
        System.out.println("Значение функции fib("+n+")="+fib(n,func));
        System.out.println("Количество вызовов функции fib(n) c массивом вычисленных значений : " + cnt2);
    }
}




