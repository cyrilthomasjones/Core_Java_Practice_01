package programming_practice;

import java.util.Scanner;

public class SumOfOddDigit {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in);) {
			int num = sc.nextInt(), digit, sum = 0;

			while (num != 0) {
				digit = num % 10;
				if (digit % 2 != 0) {
					sum += digit;
				}
				num = num / 10;
			}
			System.out.println("Sum of even number:" + sum);
		}
	}

}
