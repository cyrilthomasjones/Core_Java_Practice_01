package programming_practice;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in);) {
			int digit, num = sc.nextInt(), reverseNum = 0;
			int temp = num;

			while (num != 0) {
				digit = num % 10;
				reverseNum = reverseNum * 10 + digit;
				num = num / 10;
			}

			if (reverseNum == temp) {
				System.out.println("Is a Palindrom");
			} else {
				System.out.println("Is not a palindrome");
			}
		}
	}

}
