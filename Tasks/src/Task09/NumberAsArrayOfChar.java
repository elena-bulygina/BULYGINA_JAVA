package Task09;

import java.util.Scanner;

//  Считать число с клавиатуры как массив символов -> этот массив символов нужно преобразовать в int-число.
//  -> 3467   {'3', '4', '6', '7'}   int x == 3467

class NumberAsArrayOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number as array of char : ");
        char text[] = scanner.nextLine().toCharArray();
        int number = 0;
        int digit;
        int n = text.length;
        for (int i=0; i<n; i++) {
            digit = (int)text[i] - '0';
            number = number * 10 + digit;
        }
        System.out.println("Number is " + number);
    }
}
