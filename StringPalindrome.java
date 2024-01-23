package programming_practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String output = "";
		
		for(int i=input.length() - 1; i >= 0; i--){
			output += input.charAt(i);
		}
		System.out.println(output.equals(input)?"String is Palindome":"String is not a Palindrome");
		scanner.close();

	}

}
