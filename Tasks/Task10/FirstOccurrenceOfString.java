package Task10;

// Считать две строки. Реализовать алгоритм, который ищет первое вхождение второй строки в первую
// Писать самим.  1-я строка: Привет, как дела, как семья?? 2-я строка: как дела Результат: 8

import java.util.Scanner;

class FirstOccurrenceOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first string : ");
        char str1[] = scanner.nextLine().toCharArray();
        System.out.println("Input second string : ");
        char str2[] = scanner.nextLine().toCharArray();

        int lenstr1 = str1.length;
        int lenstr2 = str2.length;
        int indoccr[] = new int[lenstr1];

        boolean occurfind = true;
        int posfirst = -1;
        int poslast  = -1;

        if ((lenstr2 > lenstr1)||(lenstr1==0)||(lenstr2==0))
            occurfind = false;
        else {
            int jmax = -1;
            for (int i=0; i < lenstr1; i++) {
                if ((str2[0] == str1[i])&&(str2.length+i <= lenstr1)) {
                    jmax++;
                    indoccr[jmax] = i;
                }
            }
            if (jmax >= 0) {
                boolean substr = true;
                for (int i=0; i < lenstr1; i++) {
                    posfirst = indoccr[i];
                    poslast  = posfirst + lenstr2 - 1;
                    for (int j = posfirst; j < poslast; j++)
                        if (str1[j] != str2[j - posfirst]) substr = false;
                    if (substr)
                        break;
                    else
                        substr = true;
                }
                if (!substr) occurfind = false;
            }
            else
                occurfind = false;

            if (occurfind)
                System.out.println("Строка 1 входит в строку 2 с позиции "+posfirst);
            else
                System.out.println("Вхождений нет");
        }
    }
}
