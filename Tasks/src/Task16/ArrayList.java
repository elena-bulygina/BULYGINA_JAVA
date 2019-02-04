package Task16;

// Реализовать класс arraylistList, представляющий собой список на основе массива целых чисел.
//
//        void add(int element); // добавление в конец
//        void addToBegin(int element); // добавление в начало
//        int get(int index); // получить элемент по индексу
//        void insert(int element, int index); // вставить по индексу со сдвигом
//        void reverse();
//        int getCount();
//        void sort();
//        bool contains(int element); // возвращает true, если список содержит заданный элемент
//        int indexOf(int element); // возвращает индекс элемента, если он есть в списке, -1 - если не нашел ничего
//        В main продемонстрировать работу всех методов.

import java.util.Scanner;

class ArrayList {
    int arrsize = 100;
    int counter = 0;
    int[] arraylist = new int[arrsize];

    void add(int element) {
         arraylist[getCount()] = element;
         counter++;
    }

    void addToBegin(int element) {
         insert(element,0);
    }

    int get(int index) {
        return arraylist[index];
    }

    int indexOf(int element) {
        int index = -1;
        for (int i=0; i<getCount(); i++)
            if (arraylist[i] == element) return i;
        return index;
    }

    void insert(int element, int index) {
        if (index >= arraylist.length)
            System.out.println("Позиция элемента вне границ массива.");
        else {
             if (index > getCount()) {
                 System.out.println("Элемент будет добавлен в конец массива.");
                 add(element);
             }
             else {
                  for (int i = getCount(); i > index; i--)
                      arraylist[i] = arraylist[i-1];
                  arraylist[index] = element;
                  counter++;
             }
        }
    }

    void reverse() {
        int size = getCount();
        int[] arr = new int[arrsize];
        for (int i=0; i<size; i++)
            arr[size-i-1] = arraylist[i];
        arraylist = arr;
    }

    int getCount() { return counter; }

    void sort() {
        int size = getCount();
        int minelem, indexminelem;
        for (int i = 0; i < size; i++) {
            minelem = arraylist[i];
            indexminelem = -1;
            for (int j=i+1; j < size; j++)
                if (arraylist[j] < minelem) {
                    minelem    = arraylist[j];
                    indexminelem = j;
                }
            if (indexminelem >= 0) {
                arraylist[indexminelem] = arraylist[i];
                arraylist[i] = minelem;
            }
        }
    }

    boolean contains(int element) {
        boolean cnts = false;
        for (int i=0; i<getCount(); i++)
            if (arraylist[i] == element) cnts = true;
        return cnts;
    }

    void print(String text) {
        System.out.println(text);
        for (int i = 0; i < getCount(); i++) {
            System.out.print(arraylist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int index;
        int element;
        for (int i=0; i<3; i++) {
            System.out.println("Введите добавляемый элемент :");
            element = scanner.nextInt();
            list.add(element);
        }
        list.print("Массив : ");
        for (int i=0; i<3; i++) {
            System.out.println("Введите добавляемый в начало элемент :");
            element = scanner.nextInt();
            list.addToBegin(element);
        }
        list.print("Массив : ");
        for (int i=0; i<3; i++) {
            System.out.println("Введите вставляемый элемент :");
            element = scanner.nextInt();
            System.out.println("Введите индекс вставляемого элемента :");
            index = scanner.nextInt();
            list.insert(element,index);
        }
        list.print("Массив : ");
        System.out.println();
        System.out.println("Количество элементов массива : "+ list.getCount());
        System.out.println();
        list.reverse();
        list.print("Обратный массив : ");
        System.out.println();
        list.sort();
        list.print("Отсортированный массив : ");
        System.out.println();
        System.out.println("Введите индекс элемента :");
        index = scanner.nextInt();
        System.out.println("Элемент по индексу "+index+" : "+ list.get(index));
        System.out.println();
        System.out.println("Введите элемент для поиска : ");
        element = scanner.nextInt();
        if (list.contains(element))
            System.out.println("Cписок содержит заданный элемент "+element);
        else
            System.out.println("Cписок не содержит заданный элемент "+element);
        System.out.println("Введите элемент для определения его индекса :");
        element = scanner.nextInt();
        if (list.indexOf(element) == -1)
            System.out.println("Заданный элемент "+element+" не входит в список.");
        else
            System.out.println("Заданный элемент "+element+" входит в список с индексом "+list.indexOf(element));
    }
}
