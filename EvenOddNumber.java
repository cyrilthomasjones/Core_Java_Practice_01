package programming_practice;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner scanner = new Scanner(System.in);) {
			int userInput = scanner.nextInt();

			if (userInput <= 0) {
             // System.out.println("Invalid Number Inputted");
				throw new IllegalArgumentException("Invalid number " + userInput);
			} else {
				if (userInput % 2 == 0) {
					System.out.println("User input an Even number");
				} else {
					System.out.println("User input an odd number");
				}
			}
		}
		// Close scanner with close method or try-with resource block
		// scanner.close();
	}
}
