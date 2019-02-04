package Task05;

import java.util.Scanner;

//  Объявить массив с явной инициализацей и решить следующие задачи:
//  Вывести минимальный и максимальный элементы массива.

class MinMaxOfArray { 
  	public static void main(String[] args) { 
		
		int arr[] = {4, 3, 6, 1, 2, 5, 7};
		int maxelement = arr[0], minelement = arr[0];

		for (int i = 1; i < 7; i++) { 
			if (arr[i] < minelement) minelement = arr[i];
			if (arr[i] > maxelement) maxelement = arr[i];
		} 
 
		System.out.println("Maximum element - " + minelement); 
		System.out.println("Minimum element - " + maxelement);
    }
} 
