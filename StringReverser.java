package strings;

import java.util.Scanner;

public class StringReverser {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String output = "";
		
		for (int i = input.length()-1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
		
		System.out.println(new StringBuilder(input).reverse());
		
	}

}
