package programming_practice;

import java.util.Scanner;

public class SumofEvenOdd1 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int digit, num = sc.nextInt(), evenSum = 0, oddSum = 0;
		while (num != 0) {
			digit = num % 10;
			if (digit % 2 == 0) {
				evenSum += digit;
			} else {
				oddSum += digit;
			}
			num = num / 10;
		}
		System.out.println("The sum of even number is " + evenSum);
		System.out.println("The sum of odd number is " + oddSum);
		sc.close();
	}

}
