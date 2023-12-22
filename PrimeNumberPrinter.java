package programming_practice;

import java.util.Scanner;

public class PrimeNumberPrinter {

	public static void main(String[] args) {
		/*
		 * Prime numbers are numbers that have only 2 factors: 1 and themselves.
		 * For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int start = sc.nextInt();
		System.out.println("Enter a end");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			int count = 0;
			if (i > 1) {
				// Mathematically proven to use 1/2 or square root
				for (int j = 2; j < i/2; j++) {
					if(i%j==0){
						count++;
						break;
					}
				}
				
				if(count==0){
					System.out.println(i);
				}
			}
		}
		sc.close();
	}

}
