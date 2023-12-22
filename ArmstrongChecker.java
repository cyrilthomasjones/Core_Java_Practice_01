package programming_practice;

import java.util.Scanner;

public class ArmstrongChecker {

	public static void main(String[] args) {

		/*
		 * If the sum of the cube of the digits within that number is equals to
		 * the number itself.
		 * 
		 * 1^3 + 5^3 + 3^3 equals 153. 1 + 125 + 27 = 153
		 */

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int digit, num = sc.nextInt();
		int temp = num, sum = 0;

		while (num != 0) {
			digit = num % 10;
//		  We can also use Math.pow(arg0, arg1) function
			sum += digit * digit * digit;
			num = num / 10;
		}
		System.out.println(temp == sum);
		sc.close();
	}

}
