package strings;

import java.util.Scanner;

public class StringPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		String input = sc.next();
		String output = "";

		// Reverse String
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}

		// Compare input with output
//		System.out.println(input.equalsIgnoreCase(output) ? "Palindrome" : "Not Palindrome");

		// Test "radar , level, lebel etc."

		// In built method Solution
		System.out.println(new StringBuilder(input).reverse().toString().equalsIgnoreCase(input) ? "Palindrome" : "Not Palindrome");
		

	}

}
