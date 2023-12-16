package programming_practice;

import java.util.Scanner;

public class NumberReverser {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int digit, num = sc.nextInt(),result=0;

		while (num != 0) {
			digit = num % 10;
			//Main Logic 
			result = result*10+digit;
			num = num / 10;
		}
		System.out.println(result);
		sc.close();

		// Note to try test printing the number in reverse.

	}

}
