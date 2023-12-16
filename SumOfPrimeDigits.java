package programming_practice;

import java.util.Scanner;

public class SumOfPrimeDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int digit, num = sc.nextInt(),sum = 0;
		
		while(num != 0){
			digit = num % 10;
		/* Main Logic for Sum Of Prime Digit 
		 * check if each digit is 2,3,5 or 7 */
			if(digit == 2 || digit == 3 || digit == 5 || digit == 7){
				sum = sum + digit; 
			}
			num = num / 10;
		}
		System.out.println("Sum of digit is: "+ sum);
		sc.close();

	}

}
