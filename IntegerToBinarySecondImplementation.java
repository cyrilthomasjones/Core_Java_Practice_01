package programming_practice;

import java.util.Scanner;

public class IntegerToBinarySecondImplementation {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * Here we are going to use toBinaryString(num) to get the binary
		 * representation of a string.
		 * 
		 */
		System.out.println(Integer.toBinaryString(num));
		sc.close();

	}

}
