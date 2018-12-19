  import java.util.Scanner;

  class LostNumber { 
  	public static void main(String[] args) { 
  	//	На вход вразброс подаются числа от 1 до 1000. Одно число пропустили. Какое?
  		int maxnumber = 1000;
  		int number = 0;
		int numbersum = 0;
		int standartsum = 0;
		int lostnumber = 0;
		Scanner scanner = new Scanner(System.in); 
		for (int i = 1; i < maxnumber; i++) {
        	number = scanner.nextInt(); 
        	numbersum = numbersum + number;
        	standartsum = standartsum + i;
		}
      	standartsum = standartsum + maxnumber;
      	lostnumber = standartsum - numbersum;
        System.out.println("Lost number - " + lostnumber); 
    }
  } 
