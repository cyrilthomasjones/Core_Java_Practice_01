package programming_practice;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		// Logic
		// ========================
		// year%4==0 and year%100!=0;
		// Year%400 == 0;
		// Leap Not A Leap Year

		System.out.println("Please Enter a Year");
		try (Scanner scanner = new Scanner(System.in);) {
			int userInput = scanner.nextInt();

			if (userInput <= 0) {
				throw new IllegalArgumentException("Invalid year provided: "
						+ userInput);
			} else {
				if ((userInput % 4 == 0 && userInput % 100 != 0)
						|| userInput % 400 == 0) {
					System.out.println(userInput + " is a leap year.");
				} else {
					System.out.println(userInput + " is not leap year.");
				}
			}
		}
		// close scanner or use try-with resource block
		// scanner.close();
	}

	// Test 1900(Not a leap year), 2100(Not a leap year), 2000(A leap year)
	/* The complete list of leap years in the first half of the 21st century is
	 therefore 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036,
	 2040, 2044, and 2048. */
}
