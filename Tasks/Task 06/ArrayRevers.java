  import java.util.Scanner;

//  Объявить массив с явной инициализацей и решить следующие задачи:
//  Развернуть массив:  3 4 5 6 7 -> 7 6 5 4 3

class ArrayRevers { 
  	public static void main(String[] args) { 
		
		int arr[] = {4, 3, 6, 1, 2, 5, 7};
		int arrrvs[] = new int[7];
		
		for (int i = 1; i < 7; i++)  
			arrrvs[7-i] = arr[i];
	
		System.out.println("Array :");
		for (int i = 1; i < 7; i++)
 			System.out.print(arr[i]+" ");

		System.out.println();
		System.out.println("Revers array :");
				
		for (int i = 1; i < 7; i++)
 			System.out.print(arrrvs[i]+" ");

	}
} 
