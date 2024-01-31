package programming_practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next(), output = ""; 
		
		for (int i = input.length()-1; i >= 0; i--) {
			output += input.charAt(i);
		}
		
		System.out.println(input.equals(output)?"String is a palindrome":"String is not a palindrome");
		sc.close();
		

	}

}
