package programming_practice;

import java.util.Scanner;

public class DigitOccuranceCount {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int digit, num = sc.nextInt(), digitToSearch = sc.nextInt(), count = 0;

		while (num != 0) {
			digit = num % 10;
			if (digit == digitToSearch) {
				count++;
			}
			num = num / 10;
		}

		System.out.println("Count of digits occurance is: " + count);
		sc.close();
	}

}
