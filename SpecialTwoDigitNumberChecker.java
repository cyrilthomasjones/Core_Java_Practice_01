package programming_practice;

import java.util.Scanner;

public class SpecialTwoDigitNumberChecker {

	public static void main(String[] args) {
		
/*		Two digit number is a special number if the sum of both the 
		digit plus the product of both the digit is equal to the number 
		itself. For example 29 ==> 2+9 = 11 and 2*9 = 18.

		Therefore 11 + 18 = 29.

		Similarly, 5 + 9 = 14 and 5 * 9 = 45 Therefore 14 + 45 = 59. 

		Note that this is the logic for special two digit, The logic is different for special three or more digit number.

		digits. */
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int digit1, digit2, num = sc.nextInt(), result = 0;
	
//		Note, we don't need a loop here because there will be only two 
		digit1 = num % 10; // This below will give me the last digit
		digit2 = num / 10; // will give me the first digit
		result = (digit1 + digit2) + (digit1 * digit2);
		
		System.out.println(result == num ? "Special Number":"Not a special");
		sc.close();
		
		
		

	}

}
