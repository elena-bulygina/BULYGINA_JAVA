  import java.util.Scanner;

//  Реализовать сортировку выбором.
//  Пусть есть массив                                                              3 2 10 11 15 -5 6
//  Найдем минимум среди элементов 0 ... 6, это -5. Заменим его с 0-ым элементом  -5 2 10 11 15  3 6
//  Найдем минимум среди элементов 1 ... 6, это 2.  Заменим его с 1-ым элементом  -5 2 10 11 15  3 6
//  Найдем минимум среди элементов 2 ... 6, это 3.  Заменим его с 2-ым элементом  -5 2 3  11 15 10 6 и т.д.

class SelectionSortArray { 
  	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Input N (size of array) :");
		int n = scanner.nextInt(); 

		int arr[] = new int[n]; 

		System.out.println("Input elements of array :");
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = scanner.nextInt(); 
			System.out.println();
		}

		System.out.println();
		System.out.print("Array        : ");
		
		for (int i = 0; i < n; i++)
 			System.out.print(arr[i]+" ");

		int arrsort[] = new int[n]; 
		arrsort = arr; 
		int minelem, indexminelem;

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

		System.out.println();	
		System.out.print("Sorted array : ");
		
		for (int i = 0; i < n; i++)
 			System.out.print(arrsort[i]+" ");
	}
} 
