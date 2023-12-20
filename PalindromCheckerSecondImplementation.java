package programming_practice;

import java.util.Scanner;

public class PalindromCheckerSecondImplementation {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		/*
		 * The next() method collects input as a string. Note that, It is still a number all though 
		 * we are collecting it as a string.
		 */
		String num = sc.next();
		// Here we are using StringBuffer becos it has a reverse method (reverse())
		StringBuffer sb = new StringBuffer(num);
		String reversedNumber = sb.reverse().toString();
		// Use ternary operator or if statement 
		System.out.println(num.equals(reversedNumber)?"Palindrom":"Not a Palindrom");
		sc.close();
	}

}
