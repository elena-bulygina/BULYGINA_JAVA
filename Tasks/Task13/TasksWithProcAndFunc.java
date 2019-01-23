package Task13;

// Переложить задание 2 на функцию.
// Задания 5 - 11 переделать на функции и процедуры.

import java.util.Scanner;

public class TasksWithProcAndFunc {
    public static int BinaryNumber (int number){
        int binnumber = 0;
        int digit[] = new int[8];
        int powerof10=1;

        for (int i=0; i<8; i++) {
            digit[i] = number % 2;
            binnumber = binnumber + digit[i] * powerof10;
            powerof10 = powerof10 * 10;
            number = number / 2;
        }
        return binnumber;
    }

    public static int MinMaxOfArray(int arr[],char sign) {
        int element = arr[0];
        if (sign == '<')
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < element) element = arr[i];
            }
        else
            if (sign == '>')
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > element) element = arr[i];
                }
            else
                System.out.println("Неверно задан второй параметр");
        return element;
    }

    public static int[] ArrayRevers(int[] arr) {
        int revarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            revarr[arr.length - i-1] = arr[i];
        return revarr;
    }

    public static int LocalMaximumOfArray(int[] arr) {
        int cntlocalmax = 0;
        for (int i = 1; i < arr.length - 1; i++)
            if ((arr[i-1] < arr[i])&&(arr[i] > arr[i+1])) cntlocalmax++;
        return cntlocalmax;
    }

    public static int[] SelectionSortArray(int[] arr) {
        int minelem, indexminelem;
        int n = arr.length;
        int arrsort[] = new int[n];
        for (int i = 0; i < n; i++)
            arrsort[i] = arr[i];
        for (int i = 0; i < n; i++) {
            minelem = arrsort[i];
            indexminelem = -1;
            for (int j=i+1; j < n; j++)
                if (arrsort[j] < minelem) {
                    minelem    = arrsort[j];
                    indexminelem = j;
                }
            if (indexminelem >= 0) {
                arrsort[indexminelem] = arrsort[i];
                arrsort[i] = minelem;
            }
        }
        return arrsort;
    }

    public static int NumberAsArrayOfChar(char text[]) {
        int number = 0;
        int digit;
        int n = text.length;
        for (int i=0; i<n; i++) {
            digit = (int)text[i] - '0';
            number = number * 10 + digit;
        }
        return number;
    }

    public static boolean Substring(int posfirst, int poslast, char[] str1, char[] str2) {
        boolean substr = true;
        for (int i = posfirst; i < poslast; i++)
            if (str1[i] != str2[i - posfirst]) substr = false;
        return substr;
    }

    public static int[] SearchOccurrences(char str1[],char str2[]) {
        int lenstr1 = str1.length;
        int lenstr2 = str2.length;
        int indexoccur[] = new int[lenstr1];

        int j = -1;
        for (int i = 0; i < lenstr1; i++) {
            if ((str2[0] == str1[i]) && (lenstr2 + i <= lenstr1)) {
               j++;
               indexoccur[j] = i;
            }
        }
        return indexoccur;
    }

    public static int FirstOccurrenceOfString(char str1[],char str2[]) {
        int lenstr1 = str1.length;
        int lenstr2 = str2.length;
        int posfirst = -1;
        int poslast  = -1;
        if ((lenstr2 < lenstr1)&&(lenstr1 > 0)&&(lenstr2 > 0)) {
            boolean substr = false;
            int indoccr[] = SearchOccurrences(str1,str2);
            if (indoccr.length > 0) {
                for (int i=0; i < lenstr1; i++) {
                    posfirst = indoccr[i];
                    poslast  = posfirst + lenstr2 - 1;
                    substr = Substring(posfirst,poslast,str1,str2);
                    if (substr) break;
                }
                if (!substr) posfirst = -1;
            }
        }
        return posfirst;
    }


    public static int BinaryArraySearchAlgorithm(int n,int[] array,int number) {
        int left = 0, right = n - 1;
        int middle = left + (right - left) / 2;
        int index = -1;
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
        if (array[middle] == number)
           index = middle;
        else
            if (array[left] == number)
               index = left;
            else
                if (array[right] == number)
                    index = right;
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 0 до 255 :");
        int number = scanner.nextInt();
        System.out.println("Число          - " + number);
        System.out.println("Двоичное число - " + BinaryNumber(number));

        System.out.println("Введите число как массив символов : ");
        Scanner scanner2 = new Scanner(System.in);
        char text[] = scanner2.nextLine().toCharArray();
        System.out.println("Целое число " + NumberAsArrayOfChar(text));

        System.out.println("Введите размер массива :");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Введите массив :");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println();
        System.out.print("Массив        : {");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
        System.out.println();

        System.out.println("Maximum element - " + MinMaxOfArray(arr,'>'));
        System.out.println("Minimum element - " + MinMaxOfArray(arr,'<') );
        System.out.println("Number of local maximum : " + LocalMaximumOfArray(arr));
        System.out.println();

        System.out.print("Развернутый массив : {");
        for (int i = 0; i < arr.length; i++)
            System.out.print(ArrayRevers(arr)[i]+" ");
        System.out.println("}");
        System.out.println();

        System.out.print("Отсортированный массив : {");
        for (int i = 0; i < arr.length; i++)
            System.out.print(SelectionSortArray(arr)[i]+" ");
        System.out.println("}");
        System.out.println();

        arr = SelectionSortArray(arr);
        System.out.println("Введите искомое число для бинарного поиска :");
        number = scanner.nextInt();

        int index = BinaryArraySearchAlgorithm(n,arr,number);
        if (index > -1)
            System.out.println("Число " + number + " является элементом массива с индексом " +index+ ".");
        else
            System.out.println("Число "+number+" не является элементом массива.");

        System.out.println("Введите первую строку : ");
        char str1[] = scanner2.nextLine().toCharArray();
        System.out.println("Введите вторую строку : ");
        char str2[] = scanner2.nextLine().toCharArray();
        int posfirst = FirstOccurrenceOfString(str1,str2);
        if (posfirst != -1)
            System.out.println("Строка 2 входит в строку 1 с позиции " + posfirst);
        else
            System.out.println("Вхождений нет.");
    }
}
