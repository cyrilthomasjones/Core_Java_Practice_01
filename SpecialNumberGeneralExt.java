package programming_practice;

import java.util.Scanner;

public class SpecialNumberGeneralExt {

	public static void main(String[] args) {

		/*		Two digit number is a special number if the sum of both the 
		digit plus the product of both the digit is equal to the number 
		itself. For example 29 ==> 2+9 = 11 and 2*9 = 18.

		Therefore 11 + 18 = 29.

		Similarly, 5 + 9 = 14 and 5 * 9 = 45 Therefore 14 + 45 = 59. 

		Note that this is the logic for special two digit, The logic is different for special three or more digit number.

		digits. */
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), actualNum = num, digit, sumOfDigit = 0, productOfDigit=1;
		int result = 0;
		
		while (num != 0){
			
			digit = num % 10;
			sumOfDigit = sumOfDigit +digit;
			productOfDigit = productOfDigit * digit;
			num = num/10;
			result = sumOfDigit + productOfDigit;
		}
		System.out.println("sumOfDigit "+ sumOfDigit);
		System.out.println("productOfDigit "+ productOfDigit);
		
		System.out.println(actualNum == result?"Special Number":"Not a special");
		sc.close();
			
	}

}
