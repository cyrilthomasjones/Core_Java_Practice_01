package programming_practice;

import java.util.Scanner;

public class CreditCardIssuer {

	public static void main(String[] args) {
		// Logic
		// =========================
		// 400 to 600 Silver Card
		//
		// 600 to 800 Gold Card
		//
		// 800 to 850 platinum Card

		System.out.println("Enter a credit score");
		try (Scanner sc = new Scanner(System.in);) {
			int creditScore = sc.nextInt();

			if (creditScore < 400 || creditScore > 600) {
				throw new IllegalArgumentException(
						"Invalid Credit Score Provided: " + creditScore);
			} else {
				if (creditScore >= 400 && creditScore <= 600) {
					System.out.println("Silver Card");

				} else if (creditScore >= 600 && creditScore <= 800) {
					System.out.println("Gold Card");

				} else {
					System.out.println("Platnium Card");
				}
			}
		}
		// sc.close();
	}
}
