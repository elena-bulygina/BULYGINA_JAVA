  import java.util.Scanner;

//  Найти количество локальных максимумов в массиве
//  a0, a1, ... aN-1 размера N
//  Локальный максимум: a[i-1] < a[i] > a[i+1], для i = 1, ... N - 2

class LocalMaximumOfArray { 
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

		System.out.println("Array :");
		for (int i = 0; i < n; i++)
 			System.out.print(arr[i]+" ");

		int cntlocalmax = 0;	
		for (int i = 1; i < n-2; i++)  
			if ((arr[i-1] < arr[i])&&(arr[i] > arr[i+1])) cntlocalmax++;
	
		System.out.println("Number of local maximum : " + cntlocalmax);
	}
} 
