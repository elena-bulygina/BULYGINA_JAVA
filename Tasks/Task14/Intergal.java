package Task14;

import java.util.Scanner;

//    Реализовать программу, вычисляющую определенный интеграл x^2
//    на заданном отрезке с заданным количеством разбиений несколькими методами.
//    Метод прямоугольников - Составные квадратурные формулы
//    Метод Симпсона - Составная формула (формула Котеса)
//    Метод Трапеций - Составная формула
//    Wolfram Alpha

class Integral {
        public static double f(double x) {
            double func = 0;
            func = x*x;
            return func;
        }

        public static double integralByRectangles(double a, double b, int n) {
            double integral = 0;
            double sum = 0;
            double h,x1,xi,xiprev,xinext,xnprev;

            h = (b - a)/n;
            xnprev = a+(n-1)*h;
            x1 = a+h;
            for (int i=0; i<n; i++) {
                xi     = a+(i*h);
                xinext = a+(i+1)*h;
                xiprev = a+(i-1)*h;
                sum = sum + f(0.5*(xi+xinext))*(xinext-xi);
            }
            integral = sum;
            return integral;
        }

        public static double integralBySimpson(double a, double b, int n) {
            double integral = 0;
            double sum1 = 0, sum2 = 0;
            double h,x0,xn,x2j,x2jprev;

            h = (b - a)/(2*n);
            x0 = a;
            xn = a + n*h;
            for (int j=1; j<n; j++) {
                x2j = a+2*j*h;
                sum1 = sum1 + f(x2j);
            }
            for (int j=1; j<=n; j++) {
                x2jprev = a+(2*j-1)*h;
                sum2 = sum2 + f(x2jprev);
            }
            integral = (h/3)*(f(x0) + 2*sum1 + 4*sum2 + f(xn));
            return integral;
        }

        public static double integralByTrapeze(double a, double b, int n) {
            double integral = 0;
            double sum = 0;
            double h,x1,xi,xiprev,xinext,xnprev;

            h = (b - a)/n;
            xnprev = a+(n-1)*h;
            x1 = a+h;
            for (int i=1; i<n; i++) {
                xi = a+i*h;
                xinext = a+(i+1)*h;
                xiprev = a+(i-1)*h;
                sum = sum + f(xi)*(xinext-xiprev)/2;
            }
            integral = f(a)*(x1-a)/2 + sum + f(b)*(b-xnprev);
            return integral;
        }

        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a : ");
            double a = scanner.nextDouble();
            System.out.println("Введите b : ");
            double b = scanner.nextDouble();
            System.out.println("Введите n : ");
            int n = scanner.nextInt();
            System.out.println("Метод средних прямоугольников : "+integralByRectangles(a, b, n));
            System.out.println("Метод Симпсона                : "+integralBySimpson(a, b, n));
            System.out.println("Метод трапеций                : "+integralByTrapeze(a, b, n));
        }
}

