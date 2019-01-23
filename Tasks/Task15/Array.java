package Task15;

//   Представим, что есть массив:
//        [-3] [4] [] [] [] []  Его размер - 6  Количество элементов - 2
//   Реализовать процедуры:
//
//        вставить в массив заданное число в конец.
//        -> 5 в конец
//        [-3] [4] [5] [] [] []   Его размер - 6  Количество элементов - 3
//
//        вставить в массив заданное число в начало.
//        -> 1 в начало
//        [1] [-3] [4] [5] [] []  Его размер - 6  Количество элементов - 4
//
//        удалить число из массива по индексу
//        -> удалить второе число
//        [1] [-3] [5] [] [] []   Его размер - 6  Количество элементов - 3
//
//        вставить в массив заданное число в заданную позицию
//        -> 7 в позицию 3
//        [1] [-3] [5] [7] [] [] Его размер - 6  Количество элементов - 5

class Array {
    public static int CounterOfElements (int array[]) {
        int arrlen = array.length;
        int cntelem = 0;
        for (int i=0; i < arrlen; i++)
            if (array[i] != 0) cntelem++;
        return cntelem;
    }
    public static void AddToEnd (int array[],int element) {
        int indexaddelem = CounterOfElements(array);
        array[indexaddelem] = element;
    }
    public static void AddToBegin (int array[],int element) {
        int cntelem = CounterOfElements(array)+1;
        for (int i = cntelem; i > 0; i--)
            array[i] = array[i-1];
        array[0] = element;
    }
    public static void AddToPosition (int array[],int element,int position) {
        if (position >= array.length)
            System.out.println("Неверно задана позиция элемента массива");
        else {
            int cntelem = CounterOfElements(array)-position+1;
            for (int i = cntelem; i > position; i++)
                array[i] = array[i-1];
            array[position] = element;
        }
    }
    public static void DeleteFromPosition (int array[],int position) {
        if (position >= array.length)
            System.out.println("Неверно задана позиция элемента массива");
        else {
            int cntelem = CounterOfElements(array)-position+1;
            for (int i = position; i < cntelem; i++)
                array[i] = array[i+1];
            array[cntelem] = 0;
        }
    }
    public static void PrintArray (int array[]) {
        int cntelem = array.length;
        System.out.println();
        for (int i = 0; i < cntelem; i++)
            System.out.print(array[i]+" ");
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = -3;
        arr[1] = 4;
        PrintArray(arr);
        AddToEnd(arr,5);
        PrintArray(arr);
        AddToBegin(arr,1);
        PrintArray(arr);
        DeleteFromPosition(arr,2);
        PrintArray(arr);
        AddToPosition(arr,7,3);
        PrintArray(arr);
    }
 }
