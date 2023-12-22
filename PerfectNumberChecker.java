package programming_practice;

import java.util.Scanner;

public class PerfectNumberChecker {

	/*
	 * In short, a perfect number is a number whose multiple add up to the same
	 * number.
	 * 
	 * In number theory, a perfect number is a positive integer that is equal to
	 * the sum of its positive divisors, excluding the number itself. For
	 * instance, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 =
	 * 6, so 6 is a perfect number.
	 * 
	 * Another example is 28
	 * 
	 * 1 + 2 + 4 + 7 + 14 = 28 // Note that (1 + 2 + 4 + 7 + 14) are all
	 * multiples of 28.
	 * 
	 * Another example are 496 and 8128
	 */

	static boolean isPerfect(int num) {
		int sum = 0;
		// Check
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		// Returns a boolean result based on the comparison
		return sum == num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(isPerfect(num));
		sc.close();

	}

}
