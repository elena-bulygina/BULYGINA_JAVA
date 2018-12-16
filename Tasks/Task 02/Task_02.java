  class Task_02 { 
  	public static void main(String[] args) { 
		int number = 137;
		int binnumber = 0;
		int number1,number2,number3,number4;
		int number5,number6,number7,number8;
		System.out.println("Number        - " + number);
  		number1 = number % 2;
  		number  = number / 2;
  		number2 = number % 2;
  		number  = number / 2;
  		number3 = number % 2;
  		number  = number / 2;
  		number4 = number % 2;
  		number  = number / 2;
  		number5 = number % 2;
  		number  = number / 2;
  		number6 = number % 2;
  		number  = number / 2;
  		number7 = number % 2;
  		number  = number / 2;
  		number8 = number % 2;
		binnumber = number8 * 10000000 + number7 * 1000000 + number6 * 100000 + number5 * 10000;
		binnumber = binnumber + number4 * 1000 + number3 * 100 + number2 * 10 + number1;
  		System.out.println("Binary number - " + binnumber);
	}
  } 
