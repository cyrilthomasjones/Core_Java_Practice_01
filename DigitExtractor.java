package programming_practice;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		// Note num is initialized but digit is not initialized
		int digit, num = sc.nextInt();

		while (num != 0) {
			digit = num % 10;
			System.out.print(digit + " ");
			num = num / 10;
		}
		sc.close();

		// Note to try test printing the number in reverse.

	}

}
