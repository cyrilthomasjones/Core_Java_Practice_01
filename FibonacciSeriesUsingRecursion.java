package programming_practice;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

	/*
	 * Recursion Logic 
	 * ========================
	 * 
	 * f(1) f(2) f(3) f(4) f(5) 0 1 1 2 3
	 * 
	 * Here is why we think we can use a recursion logic display fibonacci
	 * number
	 * ====================================================================
	 * 
	 * fibonacci(5) is equal to fibonacci(4) + fibonacci(3) fibonacci(4) is
	 * equal to fibonacci(3) + fibonacci(2) fibonacci(3) is equal to
	 * fibonacci(2) + fibonacci(1) fibonacci(2) is equal to fibonacci(1) +
	 * fibonacci(0)
	 */

	private static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		sc.close();
	}

}