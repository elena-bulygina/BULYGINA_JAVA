package Task03;

import java.util.Scanner;

public class ProductOfPositionsNumbers { 

// Пусть есть последовательность (a1...aN), N->infinity, aN = -1
// Необходимо посчитать произведение входных позиций чисел, 
// у которых сумма цифр - простое число.
	
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        int productOfPositions = 1; 
        int currentNumber = scanner.nextInt(); 
        int positionNumber = 1; 
        int digitsSum = 0; 
        int currentDigit=0; 

        while (currentNumber != -1) { 

           	// Определяем сумму цифр введенного числа 

        	digitsSum = 0;
        	while (currentNumber != 0) { 
        	    currentDigit = currentNumber % 10; 
        	    digitsSum = digitsSum + currentDigit; 
        	    currentNumber = currentNumber / 10; 
	       	}
        	
			// Определяем, является ли сумма цифр введенного числа простым числом и если является, 
			// умножаем произведение входных позиций чисел на позицию текущего числа.
           	// flagSimpleNumber равен 1, если сумма цифр является простым числом, и 0 - если нет.

			int flagSimpleNumber = 1;  
        	if (digitsSum == 1) flagSimpleNumber = 0;
			else {
				int divider = 2;
            	while ((divider * divider <= digitsSum) && (flagSimpleNumber != 0)) {
            		if (digitsSum % divider == 0) flagSimpleNumber = 0; 
            		divider++;
            	}
			}       
            if (flagSimpleNumber == 1) {
            	productOfPositions = productOfPositions * positionNumber;
	       		System.out.println("The input positions of the numbers - " + positionNumber);
				System.out.println("The new product of the input positions of the numbers - " + productOfPositions);
            }
	           	
	        // Вводим следующее число и определяем его позицию

			currentNumber = scanner.nextInt(); 
            positionNumber++; 

        }

        System.out.println("Product of the input positions of the numbers - " + productOfPositions); 
   	} 
}

